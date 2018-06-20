package com.compilers.P2C_Compiler;

import java.util.HashMap;
import java.util.Map;

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
		
		visitGlobalDefinitions(ctx.globalDefinitions());
		
		writer.writeln("");
		writer.writeln("int main()");
		writer.writeln("{");
		writer.writeln(visitBlockWithoutReturn(ctx.blockWithoutReturn()));
		writer.writeln("}");
		writer.flush();
		
		return "";
	}

	
	@Override
	public String visitVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx) {
		String variable = visit(ctx.parameterGroup());
		if(ctx.constant() !=  null) {
			String assignment = ctx.constant().getText();
			
			writer.writeln(variable + " = " + assignment + ";"); 
		} else
			writer.writeln(variable + ";");
		
		return "";
	}
	
	//TODO
	// change grammar for assignment
	@Override
	public String visitParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx) { 
		String ident = ctx.identifier().getText();
		String primitiveType = ctx.type().primitiveType().getText();
		Variable var = new Variable(ident, Type.valueOf(primitiveType.toUpperCase()));
		
		String result = primitiveType + " " + ident;
		if(ctx.type().array() != null) {
			int size = Integer.parseInt(ctx.type().array().INTEGER_CONSTANT().getText());
			
			var.setArray(true);
			var.setSize(size);
			
			result += "[" + size + "]";
		}
		
		if(variables.containsKey(ident)) {
			
			//TODO CHANGE
			System.err.println();
			System.err.println("Error: Variable \"" + ident + "\" has been already initialized\n");
		} else {
			variables.put(ident, var);
		}
		
		return result;
	}
	
	//To change
	@Override 
	public String visitBlockWithoutReturn(@NotNull P2CParser.BlockWithoutReturnContext ctx) { 
	  return visitChildren(ctx); 
	}
  
	//To Change
	@Override 
	public String visitAtom(@NotNull P2CParser.AtomContext ctx) { 
	  return visitChildren(ctx); 
	}
	
	@Override public String visitOperators(@NotNull P2CParser.OperatorsContext ctx) { 
    return OperatorMapping.map(ctx.getText());
  }
  
  @Override 
  public String visitExpression(@NotNull P2CParser.ExpressionContext ctx) { 
     if (ctx.atom() != null) {
       return ctx.getText();
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
      elseIfStat.append("else if (")
                .append(visit(ctx.expression(i + 1)))
                .append("){\n")
                .append(visit(ctx.blockWithoutReturn(i+ 1)))
                .append("\n}\n");
    }
    StringBuilder elseStat = new StringBuilder();
    if (ctx.ELSE() != null) {
      elseStat.append("else {")
              .append(visit(ctx.blockWithoutReturn(1 + numElseIf)))
              .append("\n}\n");
    }
    return String.format("if (%s){\n%s}\n%s%s", condition, stat, elseIfStat.toString(), elseStat.toString());
  }
}
