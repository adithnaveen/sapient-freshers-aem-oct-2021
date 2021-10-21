package com.naveen.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Name ");
		String name = br.readLine();

		System.out.println("Enter Your Age");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Enter your salary");
		double salary = Double.parseDouble(br.readLine());

		display(name, age, salary);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("emps.txt", true));
			bw.write("Name " + name);
			bw.newLine();
			bw.write("Age " + age);
			bw.newLine();
			bw.write("Salary " + salary);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			bw.close();
		}
	}

	private static void display(String name, int age, double salary) {
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("Salary " + salary);
	}
}
