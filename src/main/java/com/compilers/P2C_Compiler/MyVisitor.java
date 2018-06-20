package com.compilers.P2C_Compiler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.compilers.P2C_Compiler.P2CParser;


@SuppressWarnings("deprecation")
public class MyVisitor extends P2CBaseVisitor<String> {
	private Map<String, Variable> variables;
	private Map<String, FunctionSpec> functions;
	private Set<String> structs;
	@SuppressWarnings("unused")
  private boolean isInFunctionDefinition = false;
	private FileWriter writer;
	
	public MyVisitor() {
	  
	}
	
	public MyVisitor(FileWriter writer) {
		this.writer = writer;
		variables = new HashMap<>();
		functions = new HashMap<>();
		structs =  new HashSet<>();
	}
	
	@Override
	public String visitProgram(@NotNull P2CParser.ProgramContext ctx) {
		try {
			writer.writeHeader();
			writer.writeln("#include <stdio.h>");
			writer.writeln("");
			writer.writeln(visit(ctx.globalDefinitions()));
			
			writer.writeln("");
			writer.writeln("int main() {");
			writer.write(visit(ctx.blockWithoutReturn()));
			writer.writeln("return 0;");
			writer.writeln("}");
			writer.flush();
		} catch(ParseCancellationException e) {
			System.err.println();
			System.err.println(e.getMessage());
		}
		return "";
	}
	

	@Override 
	public String visitGlobalDefinitions(@NotNull P2CParser.GlobalDefinitionsContext ctx) {
		return collectStringFromChilds(ctx, ctx.getChildCount() -1);
	}
	
	@Override
	public String visitBlockWithoutReturn(@NotNull P2CParser.BlockWithoutReturnContext ctx) {
		return collectStringFromChilds(ctx, ctx.getChildCount() ); 
	}
	
	@Override
	public String visitBlockElement(@NotNull P2CParser.BlockElementContext ctx) {
		return collectStringFromChilds(ctx, ctx.getChildCount()); 
	}
	
	@Override 
	public String visitBlock(@NotNull P2CParser.BlockContext ctx) { 
		return collectStringFromChilds(ctx, ctx.getChildCount());
	}

	@Override
	public String visitReturnStatement(@NotNull P2CParser.ReturnStatementContext ctx) {
		return "return " + visit(ctx.expression()) + ";\r\n";
	}
	
	@Override
	public String visitVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx) {
		String variable = visit(ctx.parameterGroup());
		String result;
		if(ctx.constant() !=  null) {
			String assignment = ctx.constant().getText();
		
			result = variable + " = " + assignment + ";\n"; 
		} else
			result = variable + ";\n";

		return result;
	}
	
	@Override 
	public String visitRecordDefinition(@NotNull P2CParser.RecordDefinitionContext ctx) { 
	  String varDeclaration = ctx.varDeclaration().stream()
	                                              .map(e-> visit(e))
	                                              .collect(Collectors.joining("\n"));
	  String ident = ctx.IDENT().getText();
	  structs.add(ident);
	  return String.format("struct %s{\n %s \n} %s;\n", ident, varDeclaration, ident);
	}
  
	
	@Override
	public String visitParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx) { 
	
		Variable var = getVariableFromParameterGroup(ctx);
		String ident = var.getIdent();
		if(variables.containsKey(ident)) {
			throw genParseError(ctx, "Variable \"" + ident + "\" has been already initialized\n");
		} else {
			variables.put(ident, var);
		}
		

		return var.toString();
	}
	
	@Override 
	public String visitAssignment(@NotNull P2CParser.AssignmentContext ctx) {
	  //return collectStringFromChilds(ctx, ctx.getChildCount()); 
	  String ident = ctx.IDENT().getText();
	  Variable var = variables.get(ident);
	  StringBuilder result = new StringBuilder();
	  result.append(var.getIdent());
	  
	  if (var.isArray()) {
	    try {
	      List<Integer> index = ctx.INTEGER_CONSTANT().stream()
	          .map(e -> Integer.parseInt(e.getText()))
	          .collect(Collectors.toList());
	      
	      var.compareWith(index);
	      
	      result.append(index.stream().map(e -> "[" + e + "]").collect(Collectors.joining()));
	    }
	    catch (Exception e) {
        throw new ParseCancellationException(e.getMessage());
      }
	    
	  }
	  
	  checkContainVariable(ident,ctx);
	  result.append(" ")
	        .append(ctx.ASSIGN().getText())
	        .append(" ")
	        .append(visit(ctx.expression()));
	  return result.toString() + ";\r\n";
	  
	}
	
	
 
	@Override 
	public String visitAtom(@NotNull P2CParser.AtomContext ctx) { 
	  if (ctx.expression() != null) {
	    StringBuilder result = new StringBuilder();
	    result.append("(")
	          .append(visit(ctx.expression()))
	          .append(")");
	    return result.toString();
	  }
	  if (ctx.TRUE() != null)
	    return "1";
	  if (ctx.FALSE() != null)
	    return "0";
	  if (ctx.funDesignator() != null) {
	    return visit(ctx.funDesignator());
	  }
	  if (ctx.IDENT() != null) {
	      String ident = ctx.IDENT().getText();
	      checkContainVariable(ident,ctx);
	  }
	  return ctx.getText();
	}
	
	@Override public String visitOperators(@NotNull P2CParser.OperatorsContext ctx) { 
		return OperatorMapping.map(ctx.getText());
  }
  
  @Override 
  public String visitExpression(@NotNull P2CParser.ExpressionContext ctx) { 
     if (ctx.atom() != null) {
       return visitAtom(ctx.atom());
     }
     if (ctx.EXCLAMATION() != null) {
       return "!" + visit(ctx.expression(0));
     }
     
     StringBuilder result = new StringBuilder();
     result.append(visit(ctx.expression(0)));
     result.append(" ");
     result.append(visit(ctx.operators()));
     result.append(" ");
     result.append(visit(ctx.expression(1)));
     
     return result.toString();
  }
  
  @Override
  public String visitFunDesignator(@NotNull P2CParser.FunDesignatorContext ctx) {
	  String funIdent = ctx.identifier().getText();
	  List<String> params = ctx.argumentList() != null ?
          ctx.argumentList().expression().stream()
                                         .map(ex -> visit(ex))
                                         .collect(Collectors.toList()) 
          : Collections.emptyList();
                                         
      if(functions.containsKey(funIdent)){
    	  FunctionSpec fun = functions.get(funIdent);
    	  if(fun.getParams().size() != params.size()) {
    		  throw genParseError(ctx, "Function \"" + funIdent 
    				  +"\" is defined with different number of parameters");
    	  }
      } else {
    	  throw genParseError(ctx, "Function \"" + funIdent + "\" is not declared");
      }
      
	  String funDefString = params.stream()
								  .collect(Collectors.joining(", "));
	  
	  return funIdent + "(" + funDefString + ")";
  }
  
  //To change
  @Override 
  public String visitIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx) { 
    
    String condition = visit(ctx.expression(0));
    String stat = visit(ctx.blockWithoutReturn(0));
    
    StringBuilder elseIfStat = new StringBuilder();
    int numElseIf = ctx.ELSIF().size();
    for (int i = 0; i < numElseIf; i++) {
      elseIfStat.append("else if (")
                .append(visit(ctx.expression(i + 1)))
                .append("){\n")
                .append(visit(ctx.blockWithoutReturn(i+ 1)))
                .append("}\n");
    }
    StringBuilder elseStat = new StringBuilder();
    if (ctx.ELSE() != null) {
      elseStat.append("else {\n")
              .append(visit(ctx.blockWithoutReturn(1 + numElseIf)))
              .append("}\n");
    }
    return String.format("if (%s){\n%s}\n%s%s", condition, stat, elseIfStat.toString(), elseStat.toString());
  }

	@Override
	public String visitFunDefinition(@NotNull P2CParser.FunDefinitionContext ctx) {
		String funIdent = ctx.identifier().getText();
		List<Variable> params = ctx.parameterList().parameterGroup() != null ?
                ctx.parameterList().parameterGroup().stream()
                                                .map(this::getVariableFromParameterGroup)
                                                .collect(Collectors.toList()) 
                : Collections.emptyList();
		
        ReturnType returnType = (ctx.resultType() != null) 
        		? getReturnType(ctx.resultType())
        		: null;
        		
        FunctionSpec funSpec = new FunctionSpec(funIdent,params,returnType);
        
        if(functions.containsKey(funIdent)) {
        	throw genParseError(ctx, "Function \"" + funIdent + "\" has been already defined");
        } else
        	functions.put(funIdent, funSpec);
        
        String block = visit(ctx.block());
        
		return funSpec.toString() + " {\r\n" + block + "\r\n}\r\n";
	}
	
	/**************************** PRIVATE METHODS *****************************/
	private String collectStringFromChilds(ParserRuleContext ctx, int childNo) {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<childNo; ++i) {
			if(ctx.getChild(i) instanceof TerminalNodeImpl)
				continue;
			builder.append(visit(ctx.getChild(i)));
		}
		
		return builder.toString();
	}
	private Variable getVariableFromParameterGroup(P2CParser.ParameterGroupContext ctx) {
		String ident = ctx.identifier().getText();
		String primitiveType = null;
		Variable var = null;
		if (ctx.type().recordType() == null) {
		  primitiveType = ctx.type().primitiveType().getText();
		  var = new Variable(ident, Type.valueOf(primitiveType.toUpperCase()));
		}
		else {
		  String type = ctx.type().recordType().getText();
		  if (structs.contains(type))
		    var = new Variable(ident, type);
		  else throw genParseError(ctx, "Struct \"" + type
          + "\" cannot be resolved to a struct\n");
		}
		
		if(ctx.type().array() != null) {
			var.setArray(true);
			List<Integer> size = ctx.type().array().INTEGER_CONSTANT()
                                     .stream()
                                     .map(e -> Integer.parseInt(e.getText()))
                                     .collect(Collectors.toList());
			var.setSize(size);
                                    
		}
		
		return var;
	}
	
	private ReturnType getReturnType(P2CParser.ResultTypeContext ctx) {
		String primitiveType = ctx.primitiveType().getText();
		boolean isArray = ctx.arrayType() != null;
		
		return new ReturnType(Type.valueOf(primitiveType.toUpperCase()), isArray);
	}
	
	private boolean checkContainVariable(String key, ParserRuleContext ctx) {
	  if (!variables.containsKey(key)) {
		  throw genParseError(ctx, "Variable \"" + key 
					+ "\" cannot be resolved to a variable\n");
	  }
	  else
	    return false;
	}
	
	@SuppressWarnings("unused")
  private boolean checkContainFunction(String key, ParserRuleContext ctx) {
	    if (!functions.containsKey(key)) {
			throw genParseError(ctx, "Function \"" 
						+ key + "\" cannot be resolved to a function\n");
	    }
	    else
	      return false;
	}
	
	private ParseCancellationException genParseError(ParserRuleContext ctx, String msg) {
		Token tok = ctx.getStart();
		return new ParseCancellationException("Error line " + tok.getLine() + ":"
				+ tok.getCharPositionInLine() + " " + msg);
	}
}
