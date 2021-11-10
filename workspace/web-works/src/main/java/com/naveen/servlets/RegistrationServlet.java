package com.naveen.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Registration;
import com.naveen.service.RegistrationService;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		
		Registration reg = new Registration(); 
		reg.setEmail(email); 
		reg.setUsername(username);
		
		RegistrationService rs = new RegistrationService(); 
		boolean flag = rs.register(reg);
		
		if(flag) {
			response.getWriter().println("Registration success");
		}else {
			response.getWriter().println("Registration Failure");
		}
	}

}
