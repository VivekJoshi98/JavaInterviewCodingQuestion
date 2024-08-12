package com.multithreading;

public class MyAnotherThread extends Thread {

	public void run()
	{
		for(int i=10;i>=1;i--) {
			
			System.out.println("Value of i is "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
