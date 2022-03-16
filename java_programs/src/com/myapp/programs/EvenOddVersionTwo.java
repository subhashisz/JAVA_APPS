package com.myapp.programs;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddVersionTwo {
	static AtomicInteger atomicNumber = new AtomicInteger(1);

	public static void main(String[] args) {
		Runnable oddEven = () -> {
			while (atomicNumber.get() < 10) {
				synchronized (atomicNumber) {
					if ((atomicNumber.get() % 2 == 0) && "Even".equals(Thread.currentThread().getName())) {
						System.out.println("Even :" + atomicNumber.getAndIncrement());
					} else {
						System.out.println("Odd :" + atomicNumber.getAndIncrement());
					}
				}
			}
		};

		Thread t1 = new Thread(oddEven);
		t1.setName("Even");
		t1.start();
		Thread t2 = new Thread(oddEven);
		t2.setName("Odd");
		t2.start();

	}
}
