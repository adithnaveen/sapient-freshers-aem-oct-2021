package com.naveen.inhe;

public class SomeBusinessLogic {
	public static void display(Car c) {
		System.out.println("-------------------------");
		c.move();
		if (c instanceof Maruti) {
			((Maruti) c).powerSteering();
		} else if (c instanceof Hyundai) {
			((Hyundai) c).soundSystem();
		}
	}
}
