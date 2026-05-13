package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	ServletConfig config;
	ServletContext context;
	String email,driver;
	
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("Init Called");
    	this.config=config;
    	this.context=config.getServletContext();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoGet");
		email=config.getInitParameter("email");
		System.out.println("Email Id :- "+email);
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.print("Email ID :- "+email);
		driver=context.getInitParameter("driver");
		System.out.println("Driver :- "+driver);
		out.println("Driver :- "+driver);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy Called");
	}

}
