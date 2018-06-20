package com.compilers.P2C_Compiler;



import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

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
    public static void main( String[] args ) throws IOException, URISyntaxException
    {
      String input = Files.lines(Paths.get("Example.p2c"))
            .collect(Collectors.joining("\n"));
      doTest(input);
      
    }
}
