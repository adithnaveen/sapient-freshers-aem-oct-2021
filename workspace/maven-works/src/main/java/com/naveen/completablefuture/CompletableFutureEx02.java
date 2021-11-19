package com.naveen.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureEx02 {

	
	public static void main(String[] args) {
		getData1().thenCombine(getData2(), (s1, s2) -> s1 + s2).thenAccept(System.out :: println); 

	}

	private static CompletableFuture<String> getData1 () {
		return CompletableFuture.supplyAsync(() -> "India"); 
	}

	private static CompletableFuture<String> getData2 () {
		return CompletableFuture.supplyAsync(() -> "Sapient").orTimeout(1, TimeUnit.SECONDS); 
	}

	private static CompletableFuture<String> getData (String data) {
		return CompletableFuture.supplyAsync(() -> {
			sleep(1000);
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			return data; 
		}); 
	}
	
	
	static void sleep(int i ) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
