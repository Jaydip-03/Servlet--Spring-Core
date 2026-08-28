package com.jsp.unicrud.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.unicrud.dao.UniDao;
import com.jsp.unicrud.entity.University;

@WebServlet(value = "/search")
public class Search extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		University uni=UniDao.getUni(name);
		req.setAttribute("uni", uni);
		req.getRequestDispatcher("search.jsp").forward(req, resp);
	
	}
}
