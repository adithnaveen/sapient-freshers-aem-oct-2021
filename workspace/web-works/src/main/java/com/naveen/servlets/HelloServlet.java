package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	String companyName; 
	
    public HelloServlet() {
    	System.out.println("in HelloServlet-Constructor()");
    }

	 
	public void init(ServletConfig config) throws ServletException {
		System.out.println("in Init>>> ");
		companyName = config.getServletContext().getInitParameter("COMPANY1"); 
	}

 
	public void destroy() {
		System.out.println("In destroy>>>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Welcome to Servlets</h1>"); 
		out.println("</body>");
		out.println("</html>");

		System.out.println("From Servlet context got company " + companyName); 
	}

}




















