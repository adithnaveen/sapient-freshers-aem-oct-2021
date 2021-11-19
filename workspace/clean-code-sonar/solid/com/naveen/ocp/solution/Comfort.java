package com.naveen.ocp.solution;

public class Comfort implements DrivingMode {

	private static final int POWER = 500; 
	private static final int SUSPENSION_HEIGHT = 14; 
	
	
	@Override
	public int getPower() {
		return POWER; 
	}

	@Override
	public int getSuspensionHeigh() {
		return SUSPENSION_HEIGHT; 
	}

}
