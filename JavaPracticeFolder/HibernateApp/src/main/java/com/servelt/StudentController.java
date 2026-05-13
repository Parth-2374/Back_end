package com.servelt;

import java.io.IOException;

import com.bean.Student;
import com.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;


@WebServlet("/StudentController")

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;      
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	if(action.equalsIgnoreCase("insert")) {
		Student s=new Student();
		s.setFname(request.getParameter("fname"));
		s.setLnmae(request.getParameter("lname"));
		s.setEmail(request.getParameter("email"));
		s.setMobile(Long.parseLong(request.getParameter("mobile")));
		StudentDao.insertStudent(s);
		response.sendRedirect("show.jsp");
	}else if(action.equalsIgnoreCase("edit")) {
		int id=Integer.parseInt(request.getParameter("id"));
		Student s=StudentDao.getStudent(id);
		request.setAttribute("s", s);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}else if(action.equalsIgnoreCase("update")) {
		Student s=new Student();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setFname(request.getParameter("fname"));
		s.setLnmae(request.getParameter("lname"));
		s.setEmail(request.getParameter("email"));
		s.setMobile(Long.parseLong(request.getParameter("mobile")));
		StudentDao.insertStudent(s);
		response.sendRedirect("show.jsp");
	}else if(action.equalsIgnoreCase("delete")) {
		int id=Integer.parseInt(request.getParameter("id"));
		StudentDao.deleteStudent(id);
		response.sendRedirect("show.jsp");
	}
  }  
}