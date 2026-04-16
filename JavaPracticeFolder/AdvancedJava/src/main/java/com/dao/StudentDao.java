package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {

	public static void InsertStudent(Student s) {
		try {
			Connection conn =StudentUtil.creatConnection();
			String sql="insert into stu(fname,lname,email,mobile,address,gender)values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(1, s.getLname());
			pst.setString(1, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(1, s.getAddress());
			pst.setString(1, s.getGender());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
