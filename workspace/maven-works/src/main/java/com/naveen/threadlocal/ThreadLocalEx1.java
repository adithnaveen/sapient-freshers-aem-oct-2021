package com.naveen.threadlocal;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class MyThreadLocal extends ThreadLocal<String> {

	@Override
	protected String initialValue() {
		return String.valueOf(System.currentTimeMillis()); 
	}
	
}

public class ThreadLocalEx1 {
	public static void main(String[] args) {
		ThreadLocal threadLocal = new ThreadLocal();

		threadLocal.set("This is first value");

		System.out.println(threadLocal.get());
		
		threadLocal.remove(); 
		
		System.out.println(threadLocal.get());
		
		
		MyThreadLocal myl = new MyThreadLocal(); 
				
		Calendar instance = Calendar.getInstance(); 
		instance.setTimeInMillis(Long.parseLong(myl.get()));
		
		System.out.println(instance.getTime());
		

		Thread t1 = new Thread(() -> {
			
			System.out.println( "in the thread" + Thread.currentThread().getName() + ", " + myl.get()); 
		});
		
		t1.start(); 

		
	}
}
