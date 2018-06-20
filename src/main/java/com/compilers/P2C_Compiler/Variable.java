package com.compilers.P2C_Compiler;

import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Variable {
	private String ident;
	private Type type;
	private boolean isArray;
	private List<Integer> size;
	
	public Variable(String ident, Type type, List<Integer> size) {
		if(size.stream().anyMatch(e -> e < 0)) 
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

	public List<Integer> getSize() {
    return size;
  }

  public void setSize(List<Integer> size) {
    this.size = size;
  }

  public boolean compareWith(List<Integer> index) throws ParseCancellationException {
    if (!isArray)
      throw new ParseCancellationException("Only can compare two arraies");
    
    if (index.size() != size.size())
      throw new ParseCancellationException("Two arraies are not the same size");
    
    for (int i = 0; i < size.size(); i ++) {
      if (size.get(i) <= index.get(i))
        throw new ParseCancellationException("Indexes " + index.get(i) + " are out of bound");
    }
    
    return true;
  }
  
  @Override
	public String toString() {
		String array = isArray ? size.stream().map(e -> "[" + e + "]").collect(Collectors.joining()) : "";
		
		return type.toString().toLowerCase() + " " + ident + array ;
	}
}
