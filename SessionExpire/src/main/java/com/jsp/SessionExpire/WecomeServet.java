package com.jsp.SessionExpire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/welcome")
public class WecomeServet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		HttpSession session = req.getSession();
		
//		resp.getWriter().write("<h2>"+ session.getId()+ "</h2>  <br>");
		resp.getWriter().write("<h2>"+ req.getSession().getId() + "</h2>  <br>");
		
		
	   PrintWriter pw = resp.getWriter();
	   
	   pw.write("<html>");
	   pw.write("<head>");
	   pw.write("<body>");
	   pw.write("<a href='logout'> Logout </a>");
	   pw.write("</body>");
	   pw.write("</head>");
	   pw.write("</html>");
		
		
	}

}
