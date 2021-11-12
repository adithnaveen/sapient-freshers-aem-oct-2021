package com.naveen.service;

import com.naveen.beans.User;

public interface IUserService {

	User registerUser(String name, String email, String password);

	User login(String email, String password);

}