package com.jsp.bankcrud.controller;

import java.io.IOException;  

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.bankcrud.dao.BankDao;
import com.jsp.bankcrud.entity.Bank;
@WebServlet(value = "/search")
public class SearchBank extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String search = req.getParameter("search");
		Bank bk = BankDao.getByName(search);
		req.setAttribute("bk", bk);
		req.getRequestDispatcher("search.jsp").forward(req, resp);
	}
}
