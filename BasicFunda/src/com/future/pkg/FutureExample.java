package com.future.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		/*
		 * //create runnable thread using Java 8 lambda Expression Runnable task
		 * = () ->{ String threadName = Thread.currentThread().getName();
		 * System.out.println(threadName); }; task.run();
		 * 
		 * Thread thread = new Thread(task); thread.setDaemon(true);
		 * thread.start();
		 * 
		 * System.out.println("Done...!");
		 * System.out.println(thread.isDaemon());
		 */

		/*
		 * Runnable runnable =() -> { try { String nameString
		 * =Thread.currentThread().getName(); System.out.println("1"
		 * +nameString); TimeUnit.SECONDS.sleep(5); System.out.println("2"
		 * +nameString); } catch (Exception e) { e.printStackTrace(); } };
		 * runnable.run();
		 * 
		 * Thread thread = new Thread(runnable); thread.start();
		 * 
		 * ExecutorService executorService =
		 * Executors.newSingleThreadExecutor();
		 * executorService.submit(runnable); executorService.shutdown();
		 */

		/*
		Callable<Integer> taskCallable = () -> {
			try {
				TimeUnit.SECONDS.sleep(5);
				System.out.println("HI");
				return 121;
			} catch (Exception e) {
				e.printStackTrace();
				return 133;
			}
		};
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> future = executorService.submit(taskCallable);
		
		System.out.println("future done ?" + future.isDone());
		Integer resultInteger = future.get();

		System.out.println("future done ?" + future.isDone());
		System.out.println(resultInteger);
		
		executorService.shutdown();
		*/
		
		ExecutorService executor = Executors.newWorkStealingPool();

		List<Callable<String>> callables = Arrays.asList(
		        () -> "task1",
		        () -> "task2",
		        () -> "task3");

		executor.invokeAll(callables)
		    .stream()
		    .map(future -> {
		        try {
		            return future.get();
		        }
		        catch (Exception e) {
		            throw new IllegalStateException(e);
		        }
		    })
		    .forEach(System.out::println);
	}

}
