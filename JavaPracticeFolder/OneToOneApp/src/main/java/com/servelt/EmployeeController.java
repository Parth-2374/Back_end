package com.servelt;

import java.io.IOException;

import org.hibernate.Session;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.dao.StudentDao;
import com.util.StudentUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert Employee")) {
			EmployeeInfo ep=new EmployeeInfo();
			ep.setFname(request.getParameter("fname"));
			ep.setLname(request.getParameter("lname"));
			ep.setEmail(request.getParameter("email"));
			ep.setMobile(request.getParameter("mobile"));
			StudentDao.insertEmployeeInfo(ep);
			
			Employee e=new Employee();
			e.setDnmae(request.getParameter("dname"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			e.setEinfo(ep);
			StudentDao.insertEmployee(e);
			response.sendRedirect("show.jsp");
		}else if(action.equalsIgnoreCase("delete")) {
			int did=Integer.parseInt(request.getParameter("did"));
			StudentDao.deleteEmployee(did);
			response.sendRedirect("show.jsp");
		}else if(action.equalsIgnoreCase("edit")) {
			int did=Integer.parseInt(request.getParameter("did"));
			Employee e= StudentDao.getEmployee(did);
			request.setAttribute("e", e);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		
		}else if(action.equalsIgnoreCase("update")) {
			 int did = Integer.parseInt(request.getParameter("did"));
			 
			 Employee e=StudentDao.getEmployee(did);
			 EmployeeInfo ep=e.getEinfo();
			 
			ep.setFname(request.getParameter("fname"));
			ep.setLname(request.getParameter("lname"));
			ep.setEmail(request.getParameter("email"));
			ep.setMobile(request.getParameter("mobile"));
					
			e.setDnmae(request.getParameter("dname"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			e.setEinfo(ep);
			
			StudentDao.insertEmployeeInfo(ep);
			StudentDao.insertEmployee(e);
			
			response.sendRedirect("show.jsp");
		}
	}

}
