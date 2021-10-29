package com.sapient.client;

import com.sapient.beans.Login;
import com.sapient.exceptions.InvalidEmailException;
import com.sapient.exceptions.NameTooShortException;
import com.sapient.service.ILoginService;
import com.sapient.service.LoginService;

public class App {
	public static void main(String[] args)
		throws NameTooShortException, InvalidEmailException{
		ILoginService service = 
				new LoginService(); 
		
		Login login = new Login(); 
		login.setUserName("Hi"); 
		login.setPassword("bye");
		
		service.validatLogin(login); 
	}
}
