package com.jsp.bankcrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.bankcrud.dao.BankDao;
import com.jsp.bankcrud.entity.Bank;

@WebServlet(value = "/display")
public class DisplayBank extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Bank> allBanks = BankDao.getAll();
		req.setAttribute("allBanks", allBanks);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
