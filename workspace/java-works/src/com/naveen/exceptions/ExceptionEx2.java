package com.naveen.exceptions;


public class ExceptionEx2 {
	public static void checkName(String name) throws NameTooShortException {
		if (name.length() < 5) {
			throw new NameTooShortException("Sorry name too short for Name : " + name);
		}
	}

	public static void processIncomeTax(String name, double income, Company companyName) 
				throws NameTooShortException, Exception {
		try {
			checkName(name);
		} catch (Exception e) {
			throw new Exception("Sorry could not process", e); 
		}
		
		if(income < 1000 && companyName.equals(Company.SAPIENT)) {
			throw new SapientSalaryTooLessException("Please check before filing " + name +
					" wrong income " + income);
		}else if(income < 750 && companyName.equals(Company.INFOSYS)) {
			throw new InfosysSalaryTooLessException("Please check before filing " + name 
					+ " wrong income " + income);
		}
		 
		
		System.out.println("Thank you Mr / Ms / Mrs : "+ name + " IT Filing Successful");
		
		
	}

	public static void main(String[] args) {
		try {
			processIncomeTax("har", 1234, Company.SAPIENT );
		} catch (NameTooShortException ntse) {
			ntse.printStackTrace();
		} catch (SapientSalaryTooLessException ntse) {
			ntse.printStackTrace();
		} catch (InfosysSalaryTooLessException ntse) {
			ntse.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
