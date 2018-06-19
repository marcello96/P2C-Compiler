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
		return "fuck you";
	}
	
	/*@Override
	public String visitExpression*/
	
	@Override 
	public String visitIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx) { 
	  
	  String condition = visit(ctx.expression(0));
    String stat = visit(ctx.blockWithoutReturn(0));
    return String.format("if(%s){\n%s}", condition, stat);
	}
}