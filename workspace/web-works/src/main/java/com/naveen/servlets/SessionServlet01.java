package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request - req.getParameter + attributes - set and get
		// session - is extracted from request + attributes - set and get
		// context/application - it is at server initialization + values from web.xml +
		// attributes - set and get

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("Value passed is " + request.getParameter("val"));
		HttpSession session = request.getSession();

		User user = new User("Lokesh", "12345");
		request.setAttribute("USER", user);
		request.setAttribute("COMPANY", "SAPIENT");
		session.setAttribute("USER", new User("Hemanth", "secret"));
		
		session.setMaxInactiveInterval(3); 

		if (session.isNew()) {
			out.println("<hr /> Welcome user <hr />");
			out.println("<hr /> Session id " + session.getId() + " <hr />");
		
		}else {
			out.println("<hr /> Welcome back user <hr/>");
			out.println("<hr /> Session id " + session.getId() + " <hr />");
			out.print("Session Time Out " + session.getMaxInactiveInterval() + " <hr />");
			out.println("Session Creation Time " +

					new Date(session.getCreationTime()) + " <hr />");
			out.println("Session Last Accessed Time " + new Date(session.getLastAccessedTime()) + " <hr />");
//			session.invalidate();
		}

		request.getRequestDispatcher("session-servlet-02").forward(request, response);
		
	}

}

class User {
	private String userName;
	private String password;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
