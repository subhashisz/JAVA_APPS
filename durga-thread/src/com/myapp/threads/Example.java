package com.myapp.threads;

public class Example {
	
	public static void main(String[] args) {
		Thread.currentThread().getThreadGroup().getName();
		Thread.currentThread().getThreadGroup().getParent().getName();
	}

}
