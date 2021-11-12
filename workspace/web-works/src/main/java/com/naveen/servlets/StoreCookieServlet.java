package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/store-cookie")
public class StoreCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		String name = req.getParameter("name");
		if(name== null) {
			resp.sendRedirect("./cookie-demo.html"); 
			return; 
		}
		
		Cookie cookie = new Cookie("data", name); 
		cookie.setMaxAge(365*24*60*60); 
		resp.addCookie(cookie);
		
		req.getRequestDispatcher("./cookie-demo.html").include(req, resp);
		out.println("<h2>Cookie Stored Successfully");
		out.close();
		
	}
}












