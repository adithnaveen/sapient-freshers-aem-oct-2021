package com.sapient.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Registration {
	private String userName; 
	private String password; 
	private String confirmPassword; 
	private String email; 
	private String gender;
}
