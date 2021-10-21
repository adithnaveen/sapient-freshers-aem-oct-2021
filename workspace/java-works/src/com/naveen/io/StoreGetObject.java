package com.naveen.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author naveenkumar
 *
 */
public class StoreGetObject {
	
	/**
	 * 
	 * @author naveenkumar
	 * @param emp
	 */
	public static void storeObject(Employee emp) {
		ObjectOutputStream oos = null;
		try {
			 oos = new ObjectOutputStream(new FileOutputStream("sample.ser"));
			
			oos.writeObject(emp);
			System.out.println("Object Saved... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	
	/**
	 * @author naveenkumar
	 */
	public static void getObject() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.ser"));
			
			Employee employee = (Employee) ois.readObject();
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		Employee employee = new Employee(123, "Hemanth", 23);
//		storeObject(employee);
		
		getObject();
		
	}
}
