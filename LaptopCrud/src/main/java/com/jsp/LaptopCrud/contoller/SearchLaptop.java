package com.jsp.LaptopCrud.contoller;

import java.io.IOException;
import java.net.http.HttpClient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.LaptopCrud.dao.LaptopDAO;
import com.jsp.LaptopCrud.entity.Laptop;



@WebServlet(value = "/search")
public class SearchLaptop extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String search = req.getParameter("search");
		Laptop lap = LaptopDAO.getByName(search);
		System.out.println(lap);
		req.setAttribute("la", lap);
		req.getRequestDispatcher("search.jsp").forward(req, resp);
	}
}
