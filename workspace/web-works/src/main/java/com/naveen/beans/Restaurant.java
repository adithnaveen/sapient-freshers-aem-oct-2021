package com.naveen.beans;

public class Restaurant {
	private String restName; 
	private String city;
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Restaurant [restName=" + restName + ", city=" + city + "]";
	}
	public Restaurant() {}
	public Restaurant(String restName, String city) {
		super();
		this.restName = restName;
		this.city = city;
	} 
	
	
	
}
