package com.naveen.service;

import com.naveen.beans.Registration;

public class RegistrationService {
	public boolean register(Registration reg) { 
		return reg.getUserName().length()>6;
	}
}
