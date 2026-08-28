package com.jsp.ReqDispatcherOne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value="/validate")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String name = req.getParameter("Username");
		String pass = req.getParameter("pass") ;
		
		PrintWriter print = resp.getWriter() ;
		
		if (name.equals("Peter") && pass.equals("1234")) {
			RequestDispatcher rd =   req.getRequestDispatcher("success.html");
			rd.include(req, resp);
			print.write("<h2> data is correct </h2>");
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.forward(req, resp);
		}
	
		
	    
		
	
	}

}
