package com.naveen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naveen.beans.User;
import com.naveen.service.IUserService;
import com.naveen.service.UserService;

public class UserServiceTest {

	IUserService userService; 
	@Before
	public void setUp() {
		userService = new UserService(); 
	}
	
	@Test
	public void registerUserTest() {
		
		String name = "Sajid"; 
		User retUser = userService.registerUser(name, "sajid@gmail.com", "12345"); 
		assertEquals(name, retUser.getName());
	}
}
