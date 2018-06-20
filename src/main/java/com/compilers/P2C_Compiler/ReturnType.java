package com.compilers.P2C_Compiler;

public class ReturnType {
	private Type type;
	private boolean isArray;
	
	public ReturnType(Type type, boolean isArray) {
		this.type = type;
		this.isArray = isArray;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public boolean isArray() {
		return isArray;
	}
	public void setArray(boolean isArray) {
		this.isArray = isArray;
	}

	@Override
	public String toString() {
		return type.toString().toLowerCase() + (isArray ? "[]" : "");
	}
	
	
}
