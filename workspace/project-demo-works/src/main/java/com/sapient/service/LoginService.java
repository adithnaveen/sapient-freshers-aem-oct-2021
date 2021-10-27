package com.sapient.service;

import com.sapient.beans.Login;
import com.sapient.dao.UserDAO;
import com.sapient.exceptions.NameTooShortException;

/**
 * 
 * @author naveenkumar
 * @see to validate the data for login 
 */
public class LoginService implements ILoginService {
	private UserDAO dao; 
	
	
	public boolean validatLogin(Login login) 
		throws NameTooShortException{
		
	// if you want to make any validation do it here 
		if(login.getUserName().length()<6) {
			throw new NameTooShortException("Sorry Name cannot be less than 6 chars" + login.getUserName()); 
		}
		dao.checkLogin(login); 
		return false; 
	}
}
