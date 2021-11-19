package com.naveen.srp;

// violation 
public class Vehicle {
	
	private final int maxFuel; 
	private int remainingFuel; 
	
	public Vehicle(int maxFuel) {
		this.maxFuel = maxFuel; 
		this.remainingFuel = maxFuel; 
	}
	
	// every car has to refuel, this is not adhering to SRP of Vehicle 
	// with this method class Vehicle is trying to achieve 2 works 
	public void reFuel() {
		this.remainingFuel = maxFuel; 
	}
	
	
	public int getRemainingFuel() {
		return remainingFuel;
	}



	public void setRemainingFuel(int remainingFuel) {
		this.remainingFuel = remainingFuel;
	}



	public int getMaxFuel() {
		return maxFuel;
	}



	public void move() {
		System.out.println("Vehicle moves..");
		this.remainingFuel --; 
	}
}
