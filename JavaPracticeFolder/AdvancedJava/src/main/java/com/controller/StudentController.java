package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

import com.bean.Student;
import com.dao.StudentDao;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql=request.getParameter("action");
		
		if(sql.equalsIgnoreCase("insert")) {
			Student s=new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setAddress(request.getParameter("address"));
			s.setGender(request.getParameter("gender"));
			StudentDao.InsertStudent(s);
//			response.sendRedirect("index.jsp");
			request.setAttribute("msg","Data Inserted Successfully ");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else if(sql.equalsIgnoreCase("edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			Student s=StudentDao.getStudent(id);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
			
		}else if(sql.equalsIgnoreCase("update")) {
			Student s=new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setAddress(request.getParameter("address"));
			s.setGender(request.getParameter("gender"));
			StudentDao.UpadteStudent(s);
			response.sendRedirect("show.jsp");
			}
		else if(sql.equalsIgnoreCase("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			StudentDao.DeleteStudent(id);
			response.sendRedirect("show.jsp");
			
		}
	}
}
