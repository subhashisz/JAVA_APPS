package com.myapp.programs;

public class EvenOddThread implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				try {
					if (i % 2 == 0 && Thread.currentThread().getName().equals("t2")) {
						notifyAll();
						System.out.println("Even Thread : " + i);
						wait();
					} else if (i % 2 != 0 && Thread.currentThread().getName().equals("t1")) {
						notifyAll();
						System.out.println("Odd Thread : " + i);
						wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		EvenOddThread obj = new EvenOddThread();
		Thread t1 = new Thread(obj, "t1");
		Thread t2 = new Thread(obj, "t2");
		t1.start();
		t2.start();

	}

}
