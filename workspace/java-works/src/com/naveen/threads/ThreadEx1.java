package com.naveen.threads;


class SomeBusinessLogic extends Thread {
	public void doMyWork() {
		for(int i=0; i<100; i++) {
			System.out.println("i value is " + i + " for " +
					Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("i value is " + i + " for "  +
					Thread.currentThread().getName() + " priority " + 
						Thread.currentThread().getPriority());
		}
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new SomeBusinessLogic().doMyWork(); 
		
		// this class + thread class 
		SomeBusinessLogic sml = new SomeBusinessLogic(); 
		sml.setName("Ronak");
		sml.setPriority(7);
		sml.start(); // thread is created and control is given to run method
//		sml.start(); // dont do this 
		
		SomeBusinessLogic sml1 = new SomeBusinessLogic();
		sml1.setName("Hemanth");
		sml1.start(); // thread is created and control is given to run method
		System.out.println("hey i'm main, exiting ");
	}
}
