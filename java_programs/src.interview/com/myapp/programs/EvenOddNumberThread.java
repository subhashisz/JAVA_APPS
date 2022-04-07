package com.myapp.programs;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddNumberThread {
	public static void main(String[] args) {
		AtomicInteger atom = new AtomicInteger(1);
		Runnable r = () -> {
			synchronized (atom) {
				while (atom.get() <= 10) {
					if (atom.get() % 2 == 0 && "Even".equals(Thread.currentThread().getName())) {
						System.out.println("E " + atom.getAndIncrement());
					} else {
						System.out.println("O " + atom.getAndIncrement());
					}
				}
			}

		};
		Thread t1 = new Thread(r, "Even");
		Thread t2 = new Thread(r, "Odd");
		t1.start();
		t2.start();
	}

}
