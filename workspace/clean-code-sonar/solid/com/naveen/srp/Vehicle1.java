package com.naveen.srp;

public class Vehicle1 {

	private final int maxFuel;
	private int remainingFuel;

	public Vehicle1(int maxFuel) {
		this.maxFuel = maxFuel;
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
