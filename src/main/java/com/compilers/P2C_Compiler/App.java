package com.compilers.P2C_Compiler;



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
	    String result = visitor.visit(parseTree);
        
	    System.out.println();
	    System.out.println(parseTree.toStringTree(parser)); // print LISP-style tree
	    System.out.println();
	    System.out.println(result);
	}
	
	private static void doTest(String _command) {
	  System.out.println(_command);
	  printDrink(_command);
	}
    @SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
      /*InputStream is = System.in;
      if ( args.length>0 ) {
          String inputFile = args[0];
          is = new FileInputStream(inputFile);
      }
      String dataspec = ""
          + "if (a == 3) do\n"
          + "let a : int = 3\n;"
          + "done\n";
      CharStream stream = new ANTLRInputStream(dataspec);
      P2CLexer lexer = new P2CLexer(stream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      P2CParser parser = new P2CParser(tokens);
      
      System.out.println("\n" + tree.getText() + "\n");
      MyVisitor myVisior = new MyVisitor();
      String result = myVisior.visitIfDefinition((IfDefinitionContext) tree);
      
      System.out.println("\n" + result + "\n");
      */
      /*File outFile = new File("out.c");
      outFile.createNewFile();
      FileOutputStream fout = new FileOutputStream(outFile);
      fout.write(result.getBytes());
      fout.close();*/
      
      /*doTest(
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
      */
    	/*String str = "";
    	Scanner s = new Scanner(System.in);
    	while(!str.equals("exit")) {
    		str = s.nextLine();
            printDrink(str);
    	}*/
    	
      doTest("let a : int;\n"
      		+ "do\n"
          + "if (a == 3 and !(b == a)) do\n"
          + "\ta = 2;\n"
          + "done\n"
          + "else do\n"
          + "\ta = 4;\n"
          + "done\n"
      		+ "done\n");
    }
}
