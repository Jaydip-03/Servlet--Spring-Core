package com.jsp.CollegeCrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.CollegeCrud.dao.CollegeDAO;
import com.jsp.CollegeCrud.entity.College;
@WebServlet(value = "/displayCollege")
public class DisplayCollege  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		List<College> li = CollegeDAO.getAll();
		System.out.println(li);
		req.setAttribute("list", li);
		
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
		
	}

}
