package com.naveen.inhe;

public class CarClient1 {
	public static void main(String[] args) {
		Car c = new Maruti();
		SomeBusinessLogic.display(c);

		c = new Hyundai();
		SomeBusinessLogic.display(c);

	}
}
