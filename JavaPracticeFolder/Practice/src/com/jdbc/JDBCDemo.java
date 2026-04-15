package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCDemo {
	static int id;
	static String fname,lname,email;
	static long mobile;
	public static Connection createConnection() {
		Connection conn =null;
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void insertData() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your First Name :- ");
		fname=sc.next();
		System.out.print("Enter Your Last Name :- ");
		lname=sc.next();
		System.out.print("Enter Your Email ID :- ");
		email=sc.next();
		System.out.print("Enter Your Mobile No :-");
		mobile=sc.nextLong();
		
		try {
			Connection conn=createConnection();
			String sql1=" select * from student where email=?";
			String sql="insert into student(fname,lname,email,mobile) values(?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			PreparedStatement pst1=conn.prepareStatement(sql1);
			pst1.setString(1, email);
			ResultSet rs =pst1.executeQuery();
			if(rs.next()) {
				System.out.println("EMAIL Id ALREADY REGISTERED");
			}else {
				pst.setString(1, fname);
				pst.setString(2, lname);
				pst.setString(3, email);
				pst.setLong(4, mobile);
				pst.executeUpdate();
				System.out.println("Data Inserted SuccessFully ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void serchStudent() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your ID :-");
		id=sc.nextInt();
		try {
			Connection conn =createConnection();
			String sql="select * from student where id=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("ID :- "+rs.getInt("id"));
				System.out.println("First Name :- "+rs.getString("fname"));
				System.out.println("Last Name :- "+rs.getString("lname"));
				System.out.println("Email ID :- "+rs.getString("email"));
				System.out.println("Mobile No :-"+rs.getLong("mobile") );
			}else {
				System.out.println("ID NOT REGISTERED");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void UpdateStudent() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your ID :- ");
		id=sc.nextInt();
		try {
			Connection conn = createConnection();
			String sql1="select * from student where id=?";
			PreparedStatement pst1=conn.prepareStatement(sql1);
			pst1.setInt(1, id);
			ResultSet rs=pst1.executeQuery();
			if(rs.next()) {
				System.out.println("ID :- "+rs.getInt("id"));
				System.out.println("First Name :- "+rs.getString("fname"));
				System.out.println("Last Name :- "+rs.getString("lname"));
				System.out.println("Email ID :- "+rs.getString("email"));
				System.out.println("Mobile No :-"+rs.getLong("mobile") );
				System.out.println("\n\nNow Enter New Details But You Can't Change Your Email Id..\n");
				System.out.print("Enter Your New First Name :-");
				fname=sc.next();
				System.out.print("Enter Your New Last Name :-");
				lname=sc.next();
//				System.out.print("Enter Your New Email ID :-");
//				email=sc.next();
				System.out.print("Enter Your New Mobile NO :-");
				mobile=sc.nextLong();
				String sql2="update student set fname=?,lname=?,mobile=? where id=?";
				PreparedStatement pst2=conn.prepareStatement(sql2);
				pst2.setString(1, fname);
				pst2.setString(2, lname);
//				pst2.setString(3, email);
				pst2.setLong(3,mobile);
				pst2.setInt(4, id);
				pst2.executeUpdate();
				System.out.println("Data Update SuccessFully ");
				}else {
				System.out.println("ID NOT REGISTERED");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void ShowAllStudent() {
		try {
			Connection conn =createConnection();
			String sql="select * from Student";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs =pst.executeQuery();
			while(rs.next()) {
				System.out.println("********************************************");
				System.out.println("ID :- "+rs.getInt("id"));
				System.out.println("First Name :- "+rs.getString("fname"));
				System.out.println("Last Name :- "+rs.getString("lname"));
				System.out.println("Email ID :- "+rs.getString("email"));
				System.out.println("Mobile No :- "+rs.getLong("mobile"));
				System.out.println("********************************************");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DeleteStudent() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your ID :- ");
		id=sc.nextInt();
		try {
			Connection conn =createConnection();
			String sql="delete from student where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Data Delete SuccessFully ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
			
		while(true) {
			System.out.println("****************************************************");
			System.out.println("1.Insert Data");
			System.out.println("2.Serch Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Show All Student");
			System.out.println("6.Exit");
			System.out.println("****************************************************");
			System.out.print("Enter Your Choice :- ");
			Scanner sc =new Scanner(System.in);
			int choice = sc.nextInt();
			
			if(choice==1) {
				insertData();
			}else if(choice ==2) {
				serchStudent();
			}else if(choice==3) {
				UpdateStudent();
			}else if(choice==4) {
				DeleteStudent();
			}else if(choice==5) {
				ShowAllStudent();
			}
			else if(choice==6) {
				System.out.println("Thank You.");
				System.out.println("****************************************************");
				break;
			}
		}
	}
}
