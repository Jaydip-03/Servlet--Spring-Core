package com.jsp.EmpCrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmpCrud.dao.EmpDAO;
import com.jsp.EmpCrud.entity.Employee;

@WebServlet(value = "/regester")
public class RegesterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("name") ;
		String stringAge = req.getParameter("age") ;
		String email = req.getParameter("email") ;
		String pass = req.getParameter("pass") ;
		String sSalary = req.getParameter("salary") ;
		String role = req.getParameter("role") ;
		String skill = req.getParameter("skill") ;
		
		int age = Integer.parseInt(stringAge) ;
		double salary = Integer.parseInt(sSalary) ;
	
		
		Employee emp = new Employee(age, name, email, pass, salary, role, skill) ;
		EmpDAO.save(emp) ;
		
		resp.sendRedirect("home.jsp");
		
		
	}

}
