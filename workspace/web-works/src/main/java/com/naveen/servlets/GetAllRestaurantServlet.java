package com.naveen.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Restaurant;
import com.naveen.service.RegistrationService;

@WebServlet("/get-all-restaurant")
public class GetAllRestaurantServlet extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// call service 
		List<Restaurant> allRestaurants = new RegistrationService().getAllRestaurants();
		
		String path ="/WEB-INF/jsp/show-restaurants.jsp"; 
		req.setAttribute("RESTAURANTS", allRestaurants);
		req.getRequestDispatcher(path).forward(req, resp);
	}
}
