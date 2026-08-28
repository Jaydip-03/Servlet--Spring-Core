package com.jsp.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value="/register")
public class HomeServlet extends HttpServlet {
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		String name = req.getParameter("fullname");
//		String pass = req.getParameter("email");
//		String email = req.getParameter("email");
//		String contact = req.getParameter("mobile");
//		
//		PrintWriter pw = resp.getWriter();
//
//		pw.write("<html>");
//		pw.write("<body>");
//
//		pw.write("<h2>Registration Details</h2>");
//		pw.write("<p>Name: " + name + "</p>");
//		pw.write("<p>Email: " + email + "</p>");
//		pw.write("<p>Password: " + pass + "</p>");
//		pw.write("<p>Mobile: " + contact + "</p>");
//
//		pw.write("</body>");
//		pw.write("</html>");
//	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("fullname");
		String pass = req.getParameter("email");
		String email = req.getParameter("email");
		String contact = req.getParameter("mobile");
		
		PrintWriter pw = resp.getWriter();

		pw.write("<html>");
		pw.write("<body>");
		
		pw.write("<h2 style='color:green;'>Registration Successful</h2>");
		pw.write("<hr>");
		pw.write("<p><b>Name:</b> " + name + "</p>");
		pw.write("<p><b>Email:</b> " + email + "</p>");
		pw.write("<p><b>Mobile:</b> " + contact + "</p>");
		
	}
	

}
