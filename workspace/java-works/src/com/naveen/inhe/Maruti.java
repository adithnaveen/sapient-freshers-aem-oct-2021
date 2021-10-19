package com.naveen.inhe;

public class Maruti extends Car {
	// overriden method 
	@Override
	public void move() {
		System.out.println("Maruti is moving... ");
	}
	
	public void powerSteering() {
		System.out.println("Maruti has power steering... ");
	}
}
