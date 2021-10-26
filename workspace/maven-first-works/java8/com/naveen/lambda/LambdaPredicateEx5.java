package com.naveen.lambda;

import java.util.Arrays;
import java.util.List;

class Account {
	private int accId;
	private String custName; 
	private double balance; 
	private String sex;
	
	public Account() {}
	public Account(int accId, String custName, double balance, String sex) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
		this.sex = sex;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custName=" + custName + ", balance=" + balance + ", sex=" + sex + "]";
	} 
	
	
}

public class LambdaPredicateEx5 {
	public static void main(String[] args) {
		
		List<Account> list = Arrays.asList(
				new Account(123, "Lokesh", 4545, "male"), 
				new Account(56, "Arti", 4466, "female"), 
				new Account(12, "Amit", 7744, "male"), 
				new Account(65, "Shivanand", 3355, "male"), 
				new Account(55, "Bhavya", 3265, "female"), 
				new Account(23, "Vinod", 1234, "male"), 
				new Account(44, "Harry", 1122, "male") 
				); 
		
		
		
		
		
		
		
		
		
		
	}
}










