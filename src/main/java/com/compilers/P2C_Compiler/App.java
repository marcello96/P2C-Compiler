package com.compilers.P2C_Compiler;

import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("deprecation")
	private static void printDrink(String drinkSentence) {
	    // Get our lexer
	    P2CLexer lexer = new P2CLexer(new ANTLRInputStream(drinkSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    P2CParser parser = new P2CParser(tokens);
	    
	    String sourceFile = "result.c";
	    
	    FileWriter writer = new FileWriter(sourceFile);
	    ParseTree parseTree = parser.program();
	    // Add listener
	    MyVisitor visitor = new MyVisitor(writer);
	    visitor.visit(parseTree);
        
	    System.out.println();
	    System.out.println(parseTree.toStringTree(parser)); // print LISP-style tree
	}
	
	private static void doTest(String _command) {
	  System.out.println(_command);
	  printDrink(_command);
	}
    public static void main( String[] args )
    {
      /*doTest("let a : array[10] of int;");
      doTest("let _a12 : array[10] of int;");
      doTest("let a : int;");
      doTest("let _a12 : int;");
      doTest("let _a12 : int = 214;");
      doTest("let _a12 : int = 12.1234123;");
      doTest("-12345 + 2341 + (23.212 / 123.2);");
      doTest("fun asd(a:int, b:string) -> int do let ab_2 : int; return 342; done");
      doTest("while (a == 3) do done");
      doTest("while (1 <= 2) do let a_12 : int = -123; a_12 = 3; done");
      doTest("if (a == 3) a = 4; elsif (a == 2) a = 2; elsif (a == 1) let _b12 : int = 12; else b_12 = -3.3;");
      doTest("for (i = 2; i <= 3; i = i + 1) do i = i + 1; done");*/
      
      doTest(
          "fun foo(n : int, result : int) -> int\n" 
          +"do\r\n"  
          +"  return n;\n" 
          +"done\n"
          + "do\n"
          + "let a_12 : int = 1;\n"
          + "if (a_12 == 1)\n"
          + "a_12 = 2;\n"
          + "while (i < 3)\n"
          + "do\n"
          + "done\n"
          + "else\n"
          + "let a_13 : int = 3;\n"
          + "a_13 = -123;\n"
          + "done\n"
          );
      
    	/*String str = "";
    	Scanner s = new Scanner(System.in);
    	while(!str.equals("exit")) {
    		str = s.nextLine();
            printDrink(str);
    	}*/
    	
    }
}
