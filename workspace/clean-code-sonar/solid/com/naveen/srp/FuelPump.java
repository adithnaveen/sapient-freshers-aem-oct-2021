package com.naveen.srp;

public class FuelPump {

	public void reFuel(Vehicle1 vehicle) {
		final int remainingFuel = vehicle.getRemainingFuel();
		int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
		vehicle.setRemainingFuel(remainingFuel + additionalFuel);
	}
}
