package com.sapient.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Restaurant {
	private int rId; 
	private String rName; 
	private String city; 
	private String state; 
	private String phone; 
	private String emai; 
}
