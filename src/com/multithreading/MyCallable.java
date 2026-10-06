package com.multithreading;
import java.util.concurrent.*;

public class MyCallable implements Callable<String>{
	
	public static void main(String[] args) throws Exception {
		MyCallable c1=new MyCallable();
		
		System.out.println(c1.call());
		
	//	MyCallable c2=()->{7};
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Result return from "+Thread.currentThread().getName();
	}
	
	
	

}
