package com.myapp.programs;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddArray {

	public static String getCount(int[] arr) {
		int oddCount = 0, evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = oddCount + 1;
			}
		}

		return "EvenCount : " + evenCount + " OddCount: " + oddCount;
	}

	static AtomicInteger atom = new AtomicInteger(1);

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(getCount(arr));
		Runnable r = () -> {
			while (atom.get() < 10) {
				synchronized (atom) {
					{
						if ((atom.get() % 2 == 0) && "Even".equals(Thread.currentThread().getName())) {
							System.out.println("Even No :" + atom.getAndIncrement());
						} else {
							System.out.println("Odd No :" + atom.getAndIncrement());
						}
					}
				}

			}

		};

		Thread t1 = new Thread(r);
		t1.setName("Even");
		Thread t2 = new Thread(r);
		t2.setName("Odd");
		t1.start();
		t2.start();
	}

}
