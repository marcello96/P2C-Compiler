package com.compilers.P2C_Compiler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import com.compilers.P2C_Compiler.P2CParser;


@SuppressWarnings("deprecation")
public class MyVisitor extends P2CBaseVisitor<String> {
	private Map<String, Variable> variables;
	private Map<String, FunctionSpec> functions;
	private boolean isInFunctionDefinition = false;
	private FileWriter writer;
	
	public MyVisitor() {
	  
	}
	
	public MyVisitor(FileWriter writer) {
		this.writer = writer;
		variables = new HashMap<>();
		functions = new HashMap<>();
	}
	
	@Override
	public String visitProgram(@NotNull P2CParser.ProgramContext ctx) {
		writer.writeHeader();
		writer.writeln("#include <stdio.h>");
		writer.writeln("");
		writer.writeln(visit(ctx.globalDefinitions()));
		
		writer.writeln("");
		writer.writeln("int main() {");
		writer.writeln(visit(ctx.blockWithoutReturn()));
		writer.writeln("return 0;");
		writer.writeln("}");
		writer.flush();
		
		return "";
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
	
	//TODO
	// change grammar for assignment
	@Override
	public String visitParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx) { 
	
		Variable var = getVariableFromParameterGroup(ctx);
		String ident = var.getIdent();
		if(variables.containsKey(ident)) {
			
			//TODO CHANGE
			System.err.println();
			System.err.println("Error: Variable \"" + ident + "\" has been already initialized\n");
		} else {
			variables.put(ident, var);
		}
		

		return var.toString();
	}
	
	
	public String visitBlockWithoutReturn(@NotNull P2CParser.BlockWithoutReturnContext ctx) { 
	  return visitChildren(ctx); 
	}
 
	//To Change
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
  
  //To change
  @Override 
  public String visitIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx) { 
    
    String condition = visit(ctx.expression(0));
    String stat = visit(ctx.blockWithoutReturn(0));
    
    StringBuilder elseIfStat = new StringBuilder();
    int numElseIf = ctx.ELSIF().size();
    for (int i = 0; i < numElseIf; i++) {
      elseIfStat.append("else if (\n")
                .append(visit(ctx.expression(i + 1)))
                .append("){\n")
                .append(visit(ctx.blockWithoutReturn(i+ 1)))
                .append("\n}\n");
    }
    StringBuilder elseStat = new StringBuilder();
    if (ctx.ELSE() != null) {
      elseStat.append("else {\n")
              .append(visit(ctx.blockWithoutReturn(1 + numElseIf)))
              .append("\n}\n");
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
        	System.err.println("Error: function \"" + funIdent + "\" has been already defined");
        } else
        	functions.put(funIdent, funSpec);
        
        String block = super.visitFunDefinition(ctx);
        
		return funSpec.toString() + " {\r\n" + block + "\r\n}\r\n";
	}
	
	/**************************** PRIVATE METHODS *****************************/
	private Variable getVariableFromParameterGroup(P2CParser.ParameterGroupContext ctx) {
		String ident = ctx.identifier().getText();
		String primitiveType = ctx.type().primitiveType().getText();
		Variable var = new Variable(ident, Type.valueOf(primitiveType.toUpperCase()));
		
		if(ctx.type().array() != null) {
			int size = Integer.parseInt(ctx.type().array().INTEGER_CONSTANT().getText());
			
			var.setArray(true);
			var.setSize(size);
		}
		
		return var;
	}
	
	private ReturnType getReturnType(P2CParser.ResultTypeContext ctx) {
		String primitiveType = ctx.primitiveType().getText();
		boolean isArray = ctx.arrayType() != null;
		
		return new ReturnType(Type.valueOf(primitiveType.toUpperCase()), isArray);
	}
}
