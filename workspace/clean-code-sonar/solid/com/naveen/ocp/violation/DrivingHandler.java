package com.naveen.ocp.violation;

public class DrivingHandler {
	private Vehicle vehicle; 
	
	public DrivingHandler(Vehicle vehicle) {
		this.vehicle = vehicle; 
	}
	
	public void changeDrivingMode(DrivingMode drivingMode) {
		switch (drivingMode) {
		case SPORT:
			vehicle.setPower(1000);
			vehicle.setSuspensionHeigh(17);
			break;

		case COMFORT:
			vehicle.setPower(550);
			vehicle.setSuspensionHeigh(14);
			break;

		default:
			vehicle.setPower(400);
			vehicle.setSuspensionHeigh(16);
			break;
		}
	}
}
