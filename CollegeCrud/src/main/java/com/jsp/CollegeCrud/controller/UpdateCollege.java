package com.jsp.CollegeCrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.CollegeCrud.dao.CollegeDAO;

@WebServlet(value = "/update")
public class UpdateCollege  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		req.setAttribute("id", id);
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name") ;
		
		
		CollegeDAO.updateCollege(id, name);
		resp.sendRedirect("displayCollege");
	}

}
