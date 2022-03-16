package com.myapp.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceTest {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<String> future = executorService.submit(() ->{
				return "Hello";
		});
		// some operations
		String result = future.get();
		executorService.shutdown();
	}
}
