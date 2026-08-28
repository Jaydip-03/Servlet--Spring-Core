package com.jsp.EmpCrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmpCrud.dao.EmpDAO;
import com.jsp.EmpCrud.entity.Employee;

@WebServlet(value = "/display")
public class DisplayServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Employee> l = EmpDAO.getAll();
		
		req.setAttribute("emplist", l);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	
		
		
	}

}
