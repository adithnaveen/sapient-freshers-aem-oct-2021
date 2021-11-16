package com.naveen.tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.naveen.beans.Restaurant;
import com.naveen.service.RegistrationService;

public class RestaurantGetByIdTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	private int rid; 
	
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	@Override
	public int doStartTag() throws JspException {

		// first get the attribute 
		// call a method will will get the restaurant object from DB 
		RegistrationService regService = new RegistrationService(); 
		Restaurant restaurant = regService.getRestaurantById(rid);
		
		JspWriter out = pageContext.getOut(); 
		
		
		try {
			if(restaurant == null) {
				out.println("Sorry Restaurant Not Found");
			}else {
				out.println("<table>");
				out.println("<tr>");
				out.println("<td>" + restaurant.getRestName() +"</td>");
				out.println("<td>" + restaurant.getCity() +"</td>");				
				out.println("</tr>");
				out.println("</table>"); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// do out.println -> .jsp 
		
		return super.doStartTag();
	}
	
	
}
