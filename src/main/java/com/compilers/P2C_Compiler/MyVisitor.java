package com.compilers.P2C_Compiler;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import com.compilers.P2C_Compiler.P2CParser.VarDeclarationContext;

@SuppressWarnings("deprecation")
public class MyVisitor extends P2CBaseVisitor<String> {
	private Map<String, Variable> variables;
	private Map<String, FunctionSpec> functions;
	private boolean isInFunctionDefinition = false;
	private FileWriter writer;
	
	public MyVisitor(FileWriter writer) {
		this.writer = writer;
		variables = new HashMap<>();
		functions = new HashMap<>();
	}
	
	@Override
	public String visitProgram(@NotNull P2CParser.ProgramContext ctx) {
		writer.writeHeader();
		super.visitProgram(ctx);
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
}
