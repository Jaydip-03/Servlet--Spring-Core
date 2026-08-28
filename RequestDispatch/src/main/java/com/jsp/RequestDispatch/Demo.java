package com.jsp.RequestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/demo")
public class Demo  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("test");
		rd.forward(req, resp);
		
		// these help to print content of this file
//		rd.include(req, resp);
//		
		
		
		pw.write("<h1>" +  "request recived to the demo"  + "</h1>");
		
	
	}

}
