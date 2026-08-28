package com.jsp.servetFifth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet(value="/gen")
public class GenServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = res.getWriter();
		
		HttpServletRequest http = (HttpServletRequest) req ;
		String method = http.getMethod();
		
		if(method.equals("POST"))
			pw.write("Welcome to login page");
		else if(method.equals("GET"))
			pw.write("Welcome to regester");
	}

}
