package com.naveen.ocp.solution;

public class Sports implements DrivingMode {

	private static final int POWER = 550; 
	private static final int SUSPENSION_HEIGHT = 16; 
	
	
	@Override
	public int getPower() {
		return POWER; 
	}

	@Override
	public int getSuspensionHeigh() {
		return SUSPENSION_HEIGHT; 
	}

}
