package com.jsp.unicrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.unicrud.dao.UniDao;
import com.jsp.unicrud.entity.University;

@WebServlet(value="/display")
public class Display extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<University> list=UniDao.getAll();
		req.setAttribute("alluni", list);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}


