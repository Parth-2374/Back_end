package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReader {

	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("parth1.txt");
		String s="This Is File Writer/Reder Demo";
		fw.write(s);
		fw.flush();
		fw.close();
		
		System.out.println("File Written Successfully");
		
		FileReader fr= new FileReader("parth1.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
}
