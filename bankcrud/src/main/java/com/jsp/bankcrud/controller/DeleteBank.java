package com.jsp.bankcrud.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.bankcrud.dao.BankDao;

@WebServlet(value = "/delete")
public class DeleteBank extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		BankDao.deleteById(id1);
		resp.sendRedirect("display");
	}
}
