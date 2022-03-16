package com.myapp.programs;

//write a program where deadlock happen definitely
public class DeadlockThread {

	static {
		System.out.println("Getting ready to greet the world");
		try {
			Thread t = new Thread(() -> new DeadlockThread());
			t.start();
			t.join();
		} catch (InterruptedException ex) {
			System.out.println("won't see me");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
}
