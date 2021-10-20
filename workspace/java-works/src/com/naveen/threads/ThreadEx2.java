package com.naveen.threads;

class MyBusiness implements Runnable {

	private Thread thread;
	
	public MyBusiness() {}
	
	public MyBusiness(String name, int priority) {
		thread = new Thread(this, name); 
		thread.setPriority(priority);
		// this statement will created OS level thread and invoke 
		// run() 
		thread.start(); 
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("i value is " + i + " for " + Thread.currentThread().getName() + " priority "
					+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyBusiness()); 
		t1.start(); 
		
		MyBusiness mb = new MyBusiness("Yogesh", 7); 
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("i value is " + i + " for " + Thread.currentThread().getName() + " priority "
					+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
