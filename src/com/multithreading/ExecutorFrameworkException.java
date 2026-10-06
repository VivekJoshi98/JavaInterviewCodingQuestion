package com.multithreading;

import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkException {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		// by using execute we can not catch exception easily.
//		try {
//			executor.execute(() -> {
//				int x = 10 / 0;
//
//			});
//		} catch (Exception e) {
//			System.out.println("Catched execute exception");
//		}
// by using submit we can catch exception easily.
		try {
			Future<Integer> f = executor.submit(() -> {
				return (10 / 0);
			});
			System.out.println(f.get());
		} catch (Exception e) {
			System.out.println("Catched submit exception");
		}
	}
}
