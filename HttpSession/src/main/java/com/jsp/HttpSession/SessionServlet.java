package com.jsp.HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/session")
public class SessionServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
//		HttpSession session = req.getSession();
//		session.setMaxInactiveInterval(10);
		
//		String id = session.getId();
//		resp.getWriter().write("<h1> : " + id + "</h1>");
//		resp.getWriter().write("<h1> : " + session.getId()+ "</h1>");	
		
		
		
		
		// 2nd way
		
//    	resp.getWriter().write("<h1> : " + req.getSession().getId() + "</h1>");
		
		Animal a = new Animal("Dog", 21);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("animal", a);
		
		resp.sendRedirect("ani");
		
		
		
	}

}
