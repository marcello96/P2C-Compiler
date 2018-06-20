package com.compilers.P2C_Compiler;

public class OperatorMapping {
  public static String map(String source) {
    switch (source) {
      case "and":
        return "&&";
      case "or":
        return "||";
      default:
        return source;
    }
  }
}
