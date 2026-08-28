package com.jsp.StudentCrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.StudentCrud.dao.StudentDAO;
import com.jsp.StudentCrud.entity.Student;
import com.jsp.StudentCrud.util.JPAUtil;

@WebServlet(value = "/update")
public class updateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     
		 int id = Integer.parseInt(req.getParameter("id"));
		 Student s2 = JPAUtil.getEm().find(Student.class, id);
		 req.setAttribute("std", s2);
		 req.getRequestDispatcher("update.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name"); 
		StudentDAO.updateById(id, name);
		resp.sendRedirect("viewDeveloper");
		
		
	}

}
