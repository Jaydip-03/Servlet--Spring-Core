package com.jsp.LaptopCrud.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.LaptopCrud.dao.LaptopDAO;
import com.jsp.LaptopCrud.entity.Laptop;

@WebServlet(value = "/displayLap")
public class DisplayLaptop extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Laptop> li = LaptopDAO.getAll();
		
		req.setAttribute("list", li);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	}

}
