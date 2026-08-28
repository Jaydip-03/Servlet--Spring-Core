package com.jsp.unicrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.unicrud.dao.UniDao;
import com.jsp.unicrud.entity.University;

@WebServlet(value="/register")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String loc = req.getParameter("loc");
		int rank = Integer.parseInt(req.getParameter("rank"));
		String type = req.getParameter("type");
		
		University u = new University(name, loc, email, rank, type);
		UniDao uniDao = new UniDao();
		uniDao.save(u);
		resp.sendRedirect("home.jsp");
	
	}
}
