package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); 
		User reqUser = (User) request.getAttribute("USER"); 
		User sessUser = (User) request.getSession().getAttribute("USER"); 
		
		
		System.out.println("From Servlet context got URL " +
				getServletContext().getInitParameter("url")
				);	
		out.println("In Session --- " +
		((User)request.getSession().getAttribute("USER")).getUserName());
		
		out.println("In Request " + reqUser.getUserName());
		out.println("In Session " + sessUser.getUserName()); 
		out.println("<hr /> Welcome back user <hr/>");
		out.println("<hr /> Session id " + session.getId() + " <hr />");
		out.print("Session Time Out " + session.getMaxInactiveInterval() + " <hr />");
		out.println("Session Creation Time " +

				new Date(session.getCreationTime()) + " <hr />");
		out.println("Session Last Accessed Time " + new Date(session.getLastAccessedTime()) + " <hr />");

	}

}
