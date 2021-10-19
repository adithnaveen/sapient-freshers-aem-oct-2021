package com.naveen.inhe;

public class CarClient {
	public static void main(String[] args) {
		Maruti m = new Maruti(); 
		m.move();
		m.powerSteering();
		
		System.out.println("----------------");
		Hyundai h = new Hyundai(); 
		h.move();
		h.soundSystem();
		
		System.out.println("----------------");
		Toyota t = new Toyota(); 
		t.move(); 
		
	}
}
