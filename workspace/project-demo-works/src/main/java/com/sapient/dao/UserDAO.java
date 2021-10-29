package com.sapient.dao;

import com.sapient.beans.Login;
import com.sapient.exceptions.NameTooShortException;

/**
 * 
 * @author naveenkumar
 * @see CRUD operations for user 
 * @data 
 * 	| username| password | gender| email| 
 *  | ashutosh| harry | male| ashothosh@gmail.com| 
 *  | mayuresh | testin123 | male | mayuresh@example.com|
 */
public class UserDAO {
	public boolean checkLogin(Login login)
		throws NameTooShortException{
	
		// here only code which will talk to IO 
		
		return false; 
	}
}
