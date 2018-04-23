package com.compilers.P2C_Compiler;

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
	    DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream(drinkSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    DrinkParser parser = new DrinkParser(tokens);
	 
	    // Specify our entry point
	    ParseTree tree = parser.drinkSentence();
	    System.out.println();
	    System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
	
    public static void main( String[] args )
    {
        printDrink("a pint of beer");
    }
}
