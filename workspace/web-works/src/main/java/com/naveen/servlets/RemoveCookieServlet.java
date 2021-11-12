package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/remove-name-cookie")
public class RemoveCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("data", ""); 
		cookie.setMaxAge(0);
		resp.addCookie(cookie); 
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		req.getRequestDispatcher("./cookie-demo.html").include(req, resp);
		out.println("<h3>Cookie 'data' deleted"); 
		out.close(); 
		
	}
}
