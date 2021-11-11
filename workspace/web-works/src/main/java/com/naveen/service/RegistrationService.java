package com.naveen.service;

import com.naveen.beans.Registration;

public class RegistrationService {
	public boolean register(Registration reg) {
//		IRestaurantDAO res = new RestaurantDAO(); 
//		res.getAllRestaurants(); 
		System.out.println(reg.getUserName().length());
		return reg.getUserName().length()>6;
	}
}
