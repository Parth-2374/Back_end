package com.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

import com.dao.UserDao;


@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;


	public void destroy() {
		System.out.println("Filter Destroyed");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		boolean flag =UserDao.ckeckEmail(request.getParameter("email"));
		if(flag==false) {
			chain.doFilter(request, response);
		}
		else {
			request.setAttribute("msg", "Email Already Registerd");
			request.getRequestDispatcher("Signup.jsx").forward(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
