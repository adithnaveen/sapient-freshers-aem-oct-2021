package com.naveen.inhe;

public class CarClient2 {
	public static void main(String[] args) {
		Car [] cars = new Car[5]; 
		
		cars[0] = new Maruti(); 
		cars[1] = new Hyundai(); 
		cars[2] = new Toyota(); 
		cars[3] = new Maruti(); 
		cars[4] = new Hyundai(); 
		
		
		for(int i=0; i<cars.length; i++) {
			SomeBusinessLogic.display(cars[i]);
		}
		
	}
}
