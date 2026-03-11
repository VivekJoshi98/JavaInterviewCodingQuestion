package com.multithreading;

public class Race {
	static int c=0;
	
	 static  void  inc() {
		c++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(()->{
		for(int i=0;i<1000000;i++) {
			inc();
		}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<1000000;i++) {
				inc();
			}
			});
	

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c);
	}	
}
