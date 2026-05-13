package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.EmployeeInfo;

import com.util.StudentUtil;

public class StudentDao {

	public static void insertEmployeeInfo(EmployeeInfo e) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static void insertEmployee(Employee e1) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e1);
		tr.commit();
		session.close();
	}
	public static List<Employee> getAllEmployee(){
		Session session=StudentUtil.createSession();
		List<Employee> list=session.createQuery("from Employee").list();
		return list;
	}
	public static Employee getEmployee(int did) {
		Session session=StudentUtil.createSession();
		Employee e=session.get(Employee.class, did);
		session.close();
		return e;
	}
	public static void deleteEmployee(int did) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		Employee e=session.get(Employee.class, did);
		session.delete(e);
		tr.commit();
		session.close();
	}
	
}