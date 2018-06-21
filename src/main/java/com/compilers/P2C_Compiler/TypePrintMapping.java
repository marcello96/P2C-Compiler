package com.compilers.P2C_Compiler;

public class TypePrintMapping {
  public static String map(Type type) {
    if (type.equals(Type.INT) || type.equals(Type.BOOL) || type.equals(Type.LONG))
      return "%d";
    if (type.equals(Type.DOUBLE) || type.equals(Type.DOUBLE) || type.equals(Type.FLOAT))
      return "%f";
    return "%s";
  }
}
