package com.naveen.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.User;
import com.naveen.service.IUserService;
import com.naveen.service.UserService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = (User) req.getSession().getAttribute("user");
		if(user!=null) {
			resp.sendRedirect("./dashboard");
			return;
		}
		
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		IUserService service = new UserService();
		User user = service.login(email, password);
		
		if(user == null) {
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		}
		else {
			req.getSession().setAttribute("user", user);
			resp.sendRedirect("./dashboard");
		}
	}
}
