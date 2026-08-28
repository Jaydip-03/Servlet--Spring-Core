package com.jsp.StudentCrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.StudentCrud.dao.StudentDAO;
import com.jsp.StudentCrud.entity.Student;

@WebServlet(value = "/registerStud")
public class RegisterServlet extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name = req.getParameter("name") ;
		String email =  req.getParameter("email") ;
		int marks = Integer.parseInt(req.getParameter("marks"));
		String dept = req.getParameter("department");
		
		
		Student s1 = new Student(name, email, marks, dept) ;
		
		StudentDAO.save(s1);
		
		req.getRequestDispatcher("homeStudent.jsp").forward(req, resp);
		
		
		
		
		
	
	}

}
