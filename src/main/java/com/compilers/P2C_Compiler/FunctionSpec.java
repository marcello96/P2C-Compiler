package com.compilers.P2C_Compiler;

import java.util.ArrayList;
import java.util.List;

public class FunctionSpec {
	private List<Variable> params;
	private Type returnType;
	
	public FunctionSpec() {
		params = new ArrayList<Variable>();
		returnType = null;
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

	public Type getReturnType() {
		return returnType;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}
	
	
}
