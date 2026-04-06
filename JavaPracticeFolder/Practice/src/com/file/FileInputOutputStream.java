package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream("parth.txt");
		String s="This Is file input/output stream demo using java..";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		
		System.out.println("File Written Successfully");
		
		FileInputStream fis=new FileInputStream("parth.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}
	
}
