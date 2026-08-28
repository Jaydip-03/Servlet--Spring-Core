package com.jsp.Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/cookie")
public class CookiServlet extends HttpServlet {
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = req.getParameter("useremail") ;
		String pass = req.getParameter("pass") ;
		
		
		
//		Cookie cookie1 = new Cookie("email" , email) ;
//		Cookie cookie2 = new Cookie("pass", pass) ;
//		
//		resp.addCookie(cookie1);
//		resp.addCookie(cookie2);
		
		
		resp.addCookie(new Cookie("emial",email));
		
		
		resp.sendRedirect("responce.html");
	}

}
