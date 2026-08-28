package com.jsp.LaptopCrud.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.LaptopCrud.dao.LaptopDAO;
import com.jsp.LaptopCrud.entity.Laptop;
import com.jsp.LaptopCrud.util.JPAutil;

@WebServlet(value = "/update")
public class UpdateLaptop  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
		int id = Integer.parseInt(req.getParameter("id"));
		Laptop  lap = JPAutil.getEm().find(Laptop.class, id);
		req.setAttribute("lap", lap);
		req.getRequestDispatcher("update.jsp").forward(req, resp);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name"); 

		LaptopDAO.updateLap(id, name);
		
		resp.sendRedirect("displayLap");
	}

}
