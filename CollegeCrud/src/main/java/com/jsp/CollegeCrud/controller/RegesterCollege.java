package com.jsp.CollegeCrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.CollegeCrud.dao.CollegeDAO;
import com.jsp.CollegeCrud.entity.College;

@WebServlet(value = "/registercColl")
public class RegesterCollege extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("name");
		String univerSity = req.getParameter("university");
		String location = req.getParameter("loc");
		String deptCnt = req.getParameter("deptCount");
		
		College clg = new College(name, univerSity, location, deptCnt);
		
		CollegeDAO.save(clg);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}

}
