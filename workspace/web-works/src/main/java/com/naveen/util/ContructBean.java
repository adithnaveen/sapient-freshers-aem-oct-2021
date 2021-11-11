package com.naveen.util;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.naveen.beans.Registration;

public class ContructBean {

	public static Registration makeRegistrationBean(HttpServletRequest request) {
		Registration reg  = new Registration(); 
		reg.setUserName(request.getParameter("uname")); 
		reg.setPassword(request.getParameter("password"));
		reg.setGender(request.getParameter("gender"));
		reg.setAddress(request.getParameter("address"));
		
		String[] interests = request.getParameterValues("interest");
		reg.setInterests(Arrays.asList(interests));  
		reg.setQualification(request.getParameter("qual"));
		
		System.out.println("Company: "+request.getParameter("company"));
		return reg;
	}
}
