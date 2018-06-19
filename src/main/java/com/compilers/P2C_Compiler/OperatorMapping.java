package com.compilers.P2C_Compiler;

public class OperatorMapping {
  public static String map(String source) {
    switch (source) {
      case "AND":
        return "&&";
      case "OR":
        return "||";
      default:
        return source;
    }
  }
}
