package com.jsp.bankcrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.bankcrud.dao.BankDao;
import com.jsp.bankcrud.entity.Bank;
@WebServlet(value = "/register")
public class RegisterBank extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String isfc = req.getParameter("isfc");
		String location = req.getParameter("location");
		
		Bank b = new Bank(name, isfc, location);
		BankDao.register(b);
		
		resp.sendRedirect("home.jsp");
		
	}
}
