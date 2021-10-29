package com.sapient.service;

import com.sapient.beans.Login;
import com.sapient.dao.UserDAO;
import com.sapient.exceptions.InvalidEmailException;
import com.sapient.exceptions.NameTooShortException;
import com.sapient.util.Util;

/**
 * 
 * @author naveenkumar
 * @see to validate the data for login 
 */
public class LoginService implements ILoginService {
	private UserDAO dao; 
	
	
	public boolean validatLogin(Login login) 
		throws NameTooShortException, InvalidEmailException{
		
	// if you want to make any validation do it here 
		if(login.getUserName().length()<6) {
			throw new NameTooShortException("Sorry Name cannot be less than 6 chars" + login.getUserName()); 
		}
		
		 
		// how do you validate email 
		boolean flag = Util.emailPatternMathcing("sample@gmail.com", "^(.+)@(\\S+)$"); 
		if(flag) {
			dao.checkLogin(login); 
		}else {
			throw new InvalidEmailException("Invalid Email passed"); 
		}
		return false; 
	}
}
