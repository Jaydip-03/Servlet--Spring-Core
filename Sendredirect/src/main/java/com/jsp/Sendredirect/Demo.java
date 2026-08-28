package com.jsp.Sendredirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/demo")
public class Demo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		
//		String name = req.getParameter("UserName") ;
//		String  pass = req.getParameter("pass") ;
//		
//		
//		 if ("Peter".equals(name) && "1234".equals(pass)) {
//			 resp.sendRedirect("result.html");
//		}
		
		 
		
		resp.sendRedirect("result.html");
	}

}
