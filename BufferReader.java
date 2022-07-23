package com.advance.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class BufferReader {

	

	public static void main(String[] args) {
		   BufferReader hamletBufferedReader= new BufferReader();
           String HAMLET_PART_FILE_PATH="src\\com\\advance\\filehandling\\Hamlet.txt";
           
           try (FileReader hamletReader=new FileReader(HAMLET_PART_FILE_PATH)) {
        	 //  BufferReader hamletBufferedReader= new BufferReader(hamletReader);
        	   StringBuilder stringbuilder=new StringBuilder() ;
        	   String line;
        	   while((line= hamletBufferedReader).readline())!=null)) {
        		   stringbuilder.append(line);
        		   stringbuilder.append(System.lineSeparator());
        	   }
        	  
			System.out.println(StringBuilder.toString());
         	  
           }catch(IOException e) {
         	  e.printStackTrace();
           }

	}





	}


