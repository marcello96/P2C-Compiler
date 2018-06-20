package com.compilers.P2C_Compiler;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionSpec {
	private String ident;
	private List<Variable> params;
	private ReturnType returnType;
	
	public FunctionSpec(String ident, List<Variable> params, ReturnType returnType) {
		this.ident = ident;
		this.params = params;
		this.returnType = returnType;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public void addParam(Variable param) {
		params.add(param);
	}

	public List<Variable> getParams() {
		return params;
	}

	public void setParams(List<Variable> params) {
		this.params = params;
	}

	public ReturnType getReturnType() {
		return returnType;
	}

	public void setReturnType(ReturnType returnType) {
		this.returnType = returnType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String returning = (returnType != null) ? returnType.toString() : "void";
		builder.append(returning);
		builder.append(' ');
		builder.append(ident);
		builder.append('(');
		
		String funDefString = params.stream()
				.map(Variable::toString)
				.collect(Collectors.joining(", "));
		
		builder.append(funDefString);
		builder.append(')');
		
		return builder.toString();
	}
	
	
	
}
