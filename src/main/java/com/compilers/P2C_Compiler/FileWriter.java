package com.compilers.P2C_Compiler;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
	private PrintWriter writer;
	
	public FileWriter(String destinationPath) {
        try {
            this.writer = new PrintWriter(destinationPath, "UTF-8");
        } catch (IOException e) {
            System.out.println("wrong file source");
        }
    }

}
