package com.myapp.programs;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddVersionTwo {
	static AtomicInteger atomicNumber = new AtomicInteger(1);

	public static void main(String[] args) {
		Runnable oddEven = () -> {
			synchronized (atomicNumber) {
				while (atomicNumber.get() < 10) {
					if ((atomicNumber.get() % 2 == 0) && "Even".equals(Thread.currentThread().getName())) {
						System.out.println("Even :" + atomicNumber.getAndIncrement());
					} else {
						System.out.println("Odd :" + atomicNumber.getAndIncrement());
					}
				}
			}
		};

		Thread t1 = new Thread(oddEven,"Even");
		t1.start();
		Thread t2 = new Thread(oddEven,"Odd");
		t2.start();

	}
}
