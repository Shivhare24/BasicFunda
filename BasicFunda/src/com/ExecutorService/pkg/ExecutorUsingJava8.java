package com.ExecutorService.pkg;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorUsingJava8 {

	public static void main(String[] args) {
		Runnable runnable = ()->{System.out.println(Thread.currentThread().getName());};
		ExecutorService fixedExecutorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			fixedExecutorService.execute(runnable);

		}
	}

}
