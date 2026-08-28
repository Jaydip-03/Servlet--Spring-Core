package com.jsp.StudentCrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.StudentCrud.dao.StudentDAO;
import com.jsp.StudentCrud.entity.Student;

@WebServlet(value = "/viedata")
public class ShowDataServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 List<Student> studList = StudentDAO.getAll();
		 req.setAttribute("studList", studList);
		 req.getRequestDispatcher("displayStudent.jsp").forward(req, resp);
		
	}

}
