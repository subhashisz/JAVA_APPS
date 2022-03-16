package com.myapp.producer_consumer;

class Q {
	private int num;
	boolean valueSet = false;

	public synchronized void put(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("PUT---: " + num);
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("GET---: " + num);
		valueSet = false;
		notify();
		return num;
	}

}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(5000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ProducerConsumerSolution {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
