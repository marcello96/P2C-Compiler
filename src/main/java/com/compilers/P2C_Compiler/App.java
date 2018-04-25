package com.compilers.P2C_Compiler;

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
	 
	    // Specify our entry point
	    ParseTree tree = parser.varDeclaration();
	    System.out.println();
	    System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
	
	private static void doTest(String _command) {
	  System.out.println(_command);
	  printDrink(_command);
	}
    public static void main( String[] args )
    {
      doTest("let a : array[10] of int;");
      doTest("let _a12 : array[10] of int;");
      doTest("let a : int;");
      doTest("let _a12 : int;");
    	String str = "";
    	Scanner s = new Scanner(System.in);
    	while(!str.equals("exit")) {
    		str = s.nextLine();
            printDrink(str);
    	}
    	
    }
}
