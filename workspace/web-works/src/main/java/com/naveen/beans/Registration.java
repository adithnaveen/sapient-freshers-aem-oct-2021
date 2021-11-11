package com.naveen.beans;

import java.util.List;

public class Registration {

	private String userName; 
	private String password; 
	private String gender;
	private String address; 
	private List<String> interests; 
	private String qualification;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Registration [userName=" + userName + ", password=" + password + ", gender=" + gender + ", address="
				+ address + ", interests=" + interests + ", qualification=" + qualification + "]";
	}
	
	
	
	
}
