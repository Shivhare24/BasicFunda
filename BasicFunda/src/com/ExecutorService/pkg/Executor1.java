package com.ExecutorService.pkg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor1 {

	public static void main(String[] args) {

		//for (int i = 0; i < 10; i++) {
			//Thread thread = new Thread(new Task());
			//thread.start();	
		//}
		
		ExecutorService fixedExecutorService = Executors.newFixedThreadPool(10);
		//ExecutorService chachedExecutorService = Executors.newCachedThreadPool();
		//ExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
		
		for (int i = 0; i < 100; i++) {
			fixedExecutorService.execute(new Task());

		}
		
	//	for (int i = 0; i < 10; i++) {
		//	chachedExecutorService.execute(new Task());

		//}

		//for (int i = 0; i < 10; i++) {
			//scheduledExecutorService.execute(new Task());

//		}

	}

}

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName());
		
	}
	
}

