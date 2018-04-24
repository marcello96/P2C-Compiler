package com.compilers.P2C_Compiler;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.compilers.P2C_Compiler.DrinkParser.DrinkSentenceContext;
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
	
    public static void main( String[] args )
    {
    	String str = "1";
    	Scanner s = new Scanner(System.in);
    	while(!str.equals("exit")) {
    		str = s.nextLine();
            printDrink(str);
    	}
    	
    }
}
