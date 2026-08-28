package come.jsp.PracticeServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/home")
public class HomeServet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		resp.getWriter().write(req.getParameter("username"));
//		resp.getWriter().write(req.getParameter("passs"));
		
		
		resp.addCookie(new Cookie("usern", req.getParameter("username")));
		
		resp.getWriter().write("<h2>" + req.getSession().getId() +"</h2>");
		
		req.getSession().setAttribute("detail", 10);
	
	
		
	}

}
