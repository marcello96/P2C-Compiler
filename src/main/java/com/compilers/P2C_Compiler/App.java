package com.compilers.P2C_Compiler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.compilers.P2C_Compiler.P2CParser.IfDefinitionContext;
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
    @SuppressWarnings("deprecation")
    public static void main( String[] args ) throws IOException
    {
      /*InputStream is = System.in;
      if ( args.length>0 ) {
          String inputFile = args[0];
          is = new FileInputStream(inputFile);
      }*/
      String dataspec = ""
          + "if (a == 3) do\n"
          + "let a : int = 3\n;"
          + "done\n";
      CharStream stream = new ANTLRInputStream(dataspec);
      P2CLexer lexer = new P2CLexer(stream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      P2CParser parser = new P2CParser(tokens);
      ParseTree tree = parser.ifDefinition();
      
      System.out.println("\n" + tree.getText() + "\n");
      MyVisitor myVisior = new MyVisitor();
      String result = myVisior.visitIfDefinition((IfDefinitionContext) tree);
      
      System.out.println("\n" + result + "\n");
      
      /*File outFile = new File("out.c");
      outFile.createNewFile();
      FileOutputStream fout = new FileOutputStream(outFile);
      fout.write(result.getBytes());
      fout.close();*/
      
      
    }
}
