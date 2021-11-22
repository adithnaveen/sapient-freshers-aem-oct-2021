package com.naveen.utils;

public class Utility {
	public static void sleepSeconds(int secs) {
		try {
			Thread.sleep(secs*1000);
		} catch (InterruptedException e) {
		 
			 Thread.currentThread().interrupt();
		}
	}
	public static void sleepMilliSeconds(int milliSecs) {
		try {
			Thread.sleep(milliSecs);
		} catch (InterruptedException e) {
			 
			 Thread.currentThread().interrupt();
		}
	}
}
