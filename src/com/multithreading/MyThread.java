package com.multithreading;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value of i is "+i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		
		Thread thread=new Thread(t1);
		
		MyAnotherThread m1=new MyAnotherThread();
		
		thread.start();
		m1.start();
		
	}
	

}
