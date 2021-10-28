package com.sapient.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.sapient.beans.Login;

public class DAO {
	public Map<String, Login> map = new HashMap<String, Login>();
	private static String fileName = "login.ser"; 
	public void persistLogin() {
		ObjectOutputStream oos = null; 
		try {
			 oos = new ObjectOutputStream(new FileOutputStream(fileName));
			 oos.writeObject(map); 
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
	}

	
	public void getAllLogins() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)); 
			map = (Map<String, Login>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
