package com.compilers.P2C_Compiler;

public class Variable {
	private String ident;
	private Type type;
	private boolean isArray;
	private int size;
	
	public Variable(String ident, Type type, int size) {
		if(size < 0) 
			throw new IllegalArgumentException("Array size must be nonnegative number");
		
		this.ident = ident;
		this.type = type;
		this.size = size;
		this.isArray = true;
	}

	public Variable(String ident, Type type) {
		this.ident = ident;
		this.type = type;
		this.isArray = false;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		String array = isArray ? " [" + size + "]" : "";
		
		return type.toString().toLowerCase() + " " + ident + array ;
	}
}
