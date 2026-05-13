package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bean.Cart;
import com.bean.User;
import com.bean.Wishlist;
import com.dao.CartDao;
import com.dao.UserDao;
import com.dao.WishlistDao;

@WebServlet("/UserController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512 , maxFileSize = 1024 * 1024 * 512 , maxRequestSize = 1024 * 1024 * 512)
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);
		String[] items =cd.split(";");
		for(String string:items) {
			if(string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2 ,string.length() -1);
			}
		}
		return "";
		
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action=request.getParameter("action");
       
       if(action.equalsIgnoreCase("sign up"))
       {
    	   boolean flag =UserDao.checkEmail(request.getParameter("email"));
    	   if(flag==false) {
    		 if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
    		   User u=new User();
    		   u.setUsertype(request.getParameter("usertype"));
    		   u.setFname(request.getParameter("fname"));
    		   u.setLname(request.getParameter("lname"));
    		   u.setEmail(request.getParameter("email"));
    		   u.setMobile(Long.parseLong(request.getParameter("mobile")));
    		   u.setAddress(request.getParameter("address"));
    		   u.setPassword(request.getParameter("password"));
    		   
    		   String savepath="D:\\Back_end\\JavaPracticeFolder\\Project\\src\\main\\webapp\\Profile_picture";
    		   File fileSaveDir =new File(savepath);
    		   if(!fileSaveDir.exists()) {
    			   fileSaveDir.mkdir();
    		   }
    		   Part file1 =request.getPart("profile_picture");
    		   String fileName =extractfilename(file1);
    		   file1.write(savepath + File.separator+ fileName);
    		   String savepath2 ="D:\\Back_end\\JavaPracticeFolder\\Project\\src\\main\\webapp\\Profile_picture";
    		   File imgSaveDir =new File(savepath2);
    		   if(!imgSaveDir.exists()) {
    			   imgSaveDir.mkdir();
    		   }
    		   u.setProfile_picture(fileName);
    		   UserDao.signupUser(u);
    		   request.setAttribute("msg", "User Sign Up Successfully");
    		   request.getRequestDispatcher("login.jsp").forward(request, response);
    		  
    		   	}else {
    			 request.setAttribute("msg","Password & Confirm Password Does Not Match ");
      		   request.getRequestDispatcher("signup.jsp").forward(request, response);
    		 }
    	   }else {
    		   request.setAttribute("msg","Email Already Registered");
    		   request.getRequestDispatcher("signup.jsp").forward(request, response);
    	   }
       }else if(action.equalsIgnoreCase("login")){
    	   User u=UserDao.LoginUser(request.getParameter("email"));
    	   if(u==null) {
    		   request.setAttribute("msg", "Email Not Registered");
    		   request.getRequestDispatcher("login.jsp").forward(request, response);
    	   }else {
    		   if(u.getPassword().equals(request.getParameter("password"))){
    			   
    			   HttpSession session=request.getSession();
    			   session.setAttribute("u", u);
    			   if(u.getUsertype().equals("Buyer")) {
    				   List<Wishlist> list=WishlistDao.getWishlistByUser(u.getUid());
    				   session.setAttribute("wishlist_count", list.size() );
    				   List<Cart> list1=CartDao.getCartByUser(u.getUid());
    				   session.setAttribute("cart_count", list1.size() );
    			   
    			   request.getRequestDispatcher("index.jsp").forward(request, response);
    			   }else {
    				   request.getRequestDispatcher("seller-index.jsp").forward(request, response);
    			   }
    		   }else {
    			   request.setAttribute("msg", "Iccorrect Password");
        		   request.getRequestDispatcher("login.jsp").forward(request, response);
    		   }
    	   }
       }else if(action.equalsIgnoreCase("update profile")) {
    	   HttpSession session=request.getSession();
    	   User u=(User) session.getAttribute("u");
    	   if(u==null) {
    		   response.sendRedirect("login.jsp");
    		   return;
    	   }
    	   u.setFname(request.getParameter("fname"));
    	   u.setLname(request.getParameter("lname"));
    	   u.setEmail(request.getParameter("email"));
    	   u.setMobile(Long.parseLong(request.getParameter("mobile")));
    	   u.setAddress(request.getParameter("address"));
    	   Part file = request.getPart("profile_picture");

    	    if(file != null && file.getSize() > 0) {
    	        String savepath = "D:\\Back_end\\JavaPracticeFolder\\Project\\src\\main\\webapp\\Profile_picture";
    	        File fileSaveDir = new File(savepath);

    	        if(!fileSaveDir.exists()) {
    	            fileSaveDir.mkdir();
    	        }

    	        String fileName = System.currentTimeMillis()+"_"+extractfilename(file);
    	        file.write(savepath + File.separator + fileName);

    	        u.setProfile_picture(fileName); 
    	    }
    	   UserDao.updateProfile(u);
    	   request.setAttribute("msg", "Profile Update Successfully");
    	   session.setAttribute("u", u);
    	   response.sendRedirect("profile.jsp");
    	   //request.getRequestDispatcher("profile.jsp").forward(request, response);
       }
       else if(action.equalsIgnoreCase("change password")) {
    	   HttpSession session=request.getSession();
    	   User u=(User) session.getAttribute("u");
    	   if(u.getPassword().equals(request.getParameter("old_password"))) {
    		   if(request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
    			   if(!u.getPassword().equals(request.getParameter("new_password"))){
    				   UserDao.ChangePassword(u.getEmail(), request.getParameter("new_password"));
    				   session.removeAttribute("u");
    				   session.invalidate();
    				   request.setAttribute("msg", "Password Change SuccessFully");
    				   request.getRequestDispatcher("login.jsp").forward(request, response);
    			   }else {
    				   request.setAttribute("msg", "New Password Can't Be From Old Password");
    				   if(u.getUsertype().equals("Buyer")) {
    				   request.getRequestDispatcher("change-password.jsp").forward(request, response);
    				   }else {
    					   request.getRequestDispatcher("seller-change-password.jsp").forward(request, response); 
    				   }
    			   }
    		   }else {
    			   request.setAttribute("msg", "New Password & confirm New Password Does Not match");
    			   if(u.getUsertype().equals("Buyer")) {
    				   request.getRequestDispatcher("change-password.jsp").forward(request, response);
    				   }else {
    					   request.getRequestDispatcher("seller-change-password.jsp").forward(request, response); 
    				   }
    		   }
    	   }else {
    		   request.setAttribute("msg", "Old Password Does Not Match");
    		   if(u.getUsertype().equals("Buyer")) {
				   request.getRequestDispatcher("change-password.jsp").forward(request, response);
				   }else {
					   request.getRequestDispatcher("seller-change-password.jsp").forward(request, response); 
				   }
    		   }
       }
       
	}

}