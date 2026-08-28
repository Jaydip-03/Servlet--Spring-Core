package com.jsp.LaptopCrud.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.LaptopCrud.dao.LaptopDAO;
import com.jsp.LaptopCrud.entity.Laptop;

@WebServlet(value = "/registerlap")
public class RegisterLaptop extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("name");
		double price = Double.parseDouble(req.getParameter("price"));
		String ram = req.getParameter("ram");
		String rom = req.getParameter("rom");
		String version = req.getParameter("version");
		String color = req.getParameter("color");
		String wight = req.getParameter("weight");
		
		Laptop l1 = new Laptop(name, price, ram, rom, version, color, wight);
		
		LaptopDAO.save(l1);
		
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		
		
		
		
	}

}
