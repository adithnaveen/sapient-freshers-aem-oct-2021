package com.naveen.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

class Transaction {
	public int getBalance() {
		System.out.println("In Transaction " + Thread.currentThread());
		
		IntStream.range(0, 20000).forEach(t -> System.out.print(""));

		return (int) (Math.random()*10000);		
	}
}

public class CompletableFutureEx01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start - In Main : Thread " + Thread.currentThread());
		
//		singleThreadedModel();
		
//		completableFuruteMethod1(); 
		completableFuruteMethod2(); 
		
		System.out.println("End- In Main : Thread " + Thread.currentThread());
	}

	// the balance is not show, as the method completes the work before the balance is got 
	private static void completableFuruteMethod1() {
		Transaction transaction = new Transaction(); 
		System.out.println(" completableFuruteMethod1(): Thread " + Thread.currentThread());

		completableFuture(transaction).thenAccept(balance -> displayBalance(balance));
	}

	// the balance is not show, as the method completes the work before the balance is got 
	private static void completableFuruteMethod2() throws InterruptedException {
		Transaction transaction = new Transaction(); 
		System.out.println(" completableFuruteMethod1(): Thread " + Thread.currentThread());

		CompletableFuture<Integer> completableFuture = completableFuture(transaction);
		Thread.sleep(1000);
		// if needed do some other work 
		completableFuture.thenAccept(balance -> displayBalance(balance));
		Thread.sleep(1000);
	}

	
	
	
	
	private static CompletableFuture<Integer> completableFuture(Transaction transaction) {
		System.out.println("In completableFuture " + Thread.currentThread());
		return CompletableFuture.supplyAsync(() -> transaction.getBalance());
	}
	
	
	
	private static void singleThreadedModel() {
		Transaction transaction = new Transaction(); 
		System.out.println("In singleThreadedModel " + Thread.currentThread());
		displayBalance(transaction.getBalance());
	}

	private static void displayBalance(int balance) {
		System.out.println("In Display : Thread " + Thread.currentThread());
		System.out.println("Balance : " + balance);
	}
}

