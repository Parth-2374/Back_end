package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rno;
	String snmae;
	public Student(int rno, String snmae) {
		this.rno = rno;
		this.snmae = snmae;
	}
	public String toString() {
		return "Student [rno=" + rno + ", snmae=" + snmae + "]";
	}	
}
public class SerializationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student s1=new Student(1, "parth");
	Student s3=new Student(3, "Amit");
	FileOutputStream fos =new FileOutputStream("ser");
	ObjectOutputStream oos =new ObjectOutputStream(fos);
	oos.writeObject(s1);
	oos.writeObject(s3);
	oos.flush();	
	oos.close();
	
	FileInputStream fis =new FileInputStream("ser");
	ObjectInputStream ois =new ObjectInputStream(fis);
	Student s2 =(Student)ois.readObject();
	Student s4 =(Student)ois.readObject();
	System.out.println(s2);
	System.out.println(s4);
	ois.close();
}
}
