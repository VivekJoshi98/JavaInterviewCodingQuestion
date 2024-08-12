package com.multithreading;

public class ThreadOp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program started.");
		
		int x=56+34;
		System.out.println("Sum is : "+x);
		// Current Thread Name
		
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		System.out.println("Current running thread is : "+name);
		
		Thread.sleep(4000);
		
		System.out.println(currentThread.getId());
		System.out.println("Program Ended.");
	}
}
