package com.naveen.ocp.solution;

public class DrivingHandler {
	private Vehicle vehicle; 
	
	public DrivingHandler(Vehicle vehicle) {
		this.vehicle = vehicle; 
	}
	
	public void changeDrivingMode(DrivingMode drivingMode) {
		vehicle.setPower(drivingMode.getPower());
		vehicle.setSuspensionHeigh(drivingMode.getSuspensionHeigh());
	}
}
