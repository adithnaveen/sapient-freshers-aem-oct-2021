package com.naveen.exceptions;


public class ExceptionEx2 {
	public static void checkName(String name) throws NameTooShortException {
		if (name.length() < 5) {
			throw new NameTooShortException("Sorry name too short for Name : " + name);
		}
	}

	public static void processIncomeTax(String name, double income, String companyName) 
				throws NameTooShortException, Exception {
		try {
			checkName(name);
		} catch (Exception e) {
			throw new Exception("Sorry could not process", e); 
		}
		
		// if salary < 1000 && companyname is sapient 
			// throw SapientSalaryTooLessException
		// if salary < 750 && companyname is infosys
			// throw InfosysSalaryTooLessException
		
		System.out.println("Thank you Mr / Ms / Mrs : "+ name + " IT Filing Successful");
		
		
	}

	public static void main(String[] args) {
		try {
			processIncomeTax("har", 1234, "Sapient");
		} catch (NameTooShortException ntse) {
			ntse.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
