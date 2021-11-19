package com.naveen.business;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.naveen.entity.Employee;

public class SomeBusinessLogic {
	public int insertEmployee(Employee employee) {
		ObjectOutputStream oos = null; 
		try {
			 oos = new ObjectOutputStream(new FileOutputStream("sample.ser")); 
			oos.writeObject(employee); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally  {
			try {
				if(oos!=null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return 0; 
	}
	
	public int addNumbers(int num1, int num2) {
		if(num1!=0 && num2 !=0) {
			return num1 + num2; 
		}
		return 0; 
	}
}
