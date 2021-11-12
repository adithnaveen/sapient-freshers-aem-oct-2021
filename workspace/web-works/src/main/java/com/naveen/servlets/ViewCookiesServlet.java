package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view-cookies")
public class ViewCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		req.getRequestDispatcher("./cookie-demo.html").include(req, resp);
		
		Cookie[] cookies = req.getCookies();
		
		if(cookies != null && cookies.length >0) {
			out.println("<h3>Cookies List:</h3>");
			for(Cookie c : cookies) {
				out.println("<p>" + c.getName() + " Value -> " + c.getValue() +"</p>");
			}
		}
	}
}
