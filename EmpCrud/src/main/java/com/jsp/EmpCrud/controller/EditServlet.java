package com.jsp.EmpCrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmpCrud.dao.EmpDAO;
import com.jsp.EmpCrud.entity.Employee;
import com.jsp.EmpCrud.util.JPAUtil;

@WebServlet(value = "/edit")
public class EditServlet  extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// TODO Auto-generated method 
        int id = Integer.parseInt(req.getParameter("id"));
		Employee emp = JPAUtil.getEm().find(Employee.class, id);
		req.setAttribute("emp", emp);
		
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	       
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name"); 
		
		EmpDAO.updateById(id, name);
		resp.sendRedirect("display.jsp");
		
	}

}
