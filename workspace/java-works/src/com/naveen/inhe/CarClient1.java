package com.naveen.inhe;

class SomeBusinessLogic {
	public static void display(Car c) {
		c.move();
		if (c instanceof Maruti) {
			((Maruti) c).powerSteering();
		} else if (c instanceof Hyundai) {
			((Hyundai) c).soundSystem();
		}
	}
}

public class CarClient1 {
	public static void main(String[] args) {
		Car c = new Maruti();
		SomeBusinessLogic.display(c);

		c = new Hyundai();
		SomeBusinessLogic.display(c);

	}
}
