package com.jsp.ServletFourth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value="/reg")
public class GenServ extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("UserName");
		String pass  = req.getParameter("pass");
		
		
		System.out.println(name);
		System.out.println(pass);
		
		PrintWriter pw = res.getWriter();
		
		pw.write("<h1>" + name + "</h1>");
		pw.write("<h1>" + pass + "</h1>");
		
	}

}
