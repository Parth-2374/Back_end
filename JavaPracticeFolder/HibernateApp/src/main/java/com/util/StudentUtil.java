package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Student;

public class StudentUtil {

	public static Session createSession() {
		Session session=null;
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(Student.class)
				.configure()
				.buildSessionFactory();
		session=sf.openSession();
		return session;
		}
	
}
