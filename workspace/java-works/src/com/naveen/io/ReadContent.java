package com.naveen.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {
	public static void main(String[] args) {
		BufferedReader  br = null; 
		try {
			br = new BufferedReader(new FileReader("emps.txt"));
			String temp; 
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
}
