package com.jsp.LaptopCrud.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.LaptopCrud.dao.LaptopDAO;

@WebServlet(value = "/delete")
public class DeleteLaptopo extends HttpServlet {
	
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  int id = Integer.parseInt(req.getParameter("id"));
		  
		  LaptopDAO.deleteById(id);
		  resp.sendRedirect("displayLap");
		  
		  
	}

}
