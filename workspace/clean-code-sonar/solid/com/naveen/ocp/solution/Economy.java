package com.naveen.ocp.solution;

public class Economy implements DrivingMode{

	private static final int POWER = 450; 
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
