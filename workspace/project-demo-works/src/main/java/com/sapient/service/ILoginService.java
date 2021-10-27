package com.sapient.service;

import com.sapient.beans.Login;
import com.sapient.exceptions.NameTooShortException;

public interface ILoginService {

	boolean validatLogin(Login login) throws NameTooShortException;

}