package com.naveen.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Registration;
import com.naveen.service.RegistrationService;
import com.naveen.util.ContructBean;
 
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet { //  implements SingleThreadModel{
	private static final long serialVersionUID = 1L;

	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// get the parameters and give me the bean of registration 
		Registration registration = ContructBean.makeRegistrationBean(request);
		// invoke service method 
		RegistrationService regService = new RegistrationService(); 
		boolean registerFlag = regService.register(registration);
		// based on the return value got from service method 
		if(registerFlag) {
			// success page / servlet 
			request.getRequestDispatcher("/success").forward(request, response);
		}else {
			// invoke the registration page with error message  
//			response.getWriter().println("Sorry Registration Not Success<hr />"); 
//			request.getRequestDispatcher("registration-form.html").include(request, response);
			
			response.sendRedirect("index.jsp");
		}
		// redirect to respective page 
	}

}
