package com.myapp.stack;

public class Stack1 {

	int stack[] = new int[5];
	int top = 0;
	int modCount = stack.length;

	public void push(int data) {
		if (size() < stack.length - 1)
			stack[top] = data;
		top++;
	}

	public int pop() {
		top--;
		int data = stack[top];
		stack[top] = 0;
		return data;
	}

	public int peek() {
		int data = stack[top - 1];
		return data;
	}

	public int size() {
		return top;
	}

	public void show() {
		for (int i : stack) {
			System.out.print(i + " ");
		}
	}

}
