package com.multithreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameworkDemo {

	public static void main(String[] args) {

		// Executor Framework

		ExecutorService executor = Executors.newFixedThreadPool(2); // i have created one thread pool with 2 thread

		// number of task = 5

		for (int i = 1; i <= 5; i++) {
			int taskId = i;
			executor.execute(() -> { // execute takes runnable and doesn't return anything
				System.out.println("Task " + taskId + " is performed by " + Thread.currentThread().getName());
			});

		}
		// Future and callable

		Future<Integer> f1 = executor.submit(() -> 5); // Submit take callable and return a value;

		try {
			Thread.sleep(3000);
			System.out.println(f1.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println("zxcvbnm");
		
		//  invokeAll 
		
		List<Callable<Integer>> tasks = List.of(() -> 10, () -> 20, () -> 30);
		try {

			List<Future<Integer>> future = executor.invokeAll(tasks);
			for (Future<Integer> f : future) {
				System.out.println(f.get());

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		executor.shutdown();
	}
}
