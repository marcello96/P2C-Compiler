package com.compilers.P2C_Compiler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileWriter {
	private PrintWriter writer;
	
	public FileWriter(String destinationPath) {
        try {
            this.writer = new PrintWriter(destinationPath, "UTF-8");
        } catch (IOException e) {
            System.out.println("wrong file source");
        }
    }

	public void writeln(String content) {
		writer.println(content);
	}
	
	 public void write(String content) {
	    writer.print(content);
	  }
	
	public void writeHeader() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		writer.println("/** This code is generated by P2C Compiler **/");
		writer.println("/** " + LocalDateTime.now().format(formatter) + " **/");
		writer.println();
	}
	
	public void flush() {
		writer.flush();
	}
}
