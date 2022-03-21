package com.myapp.queue;

//FIFO
public class Queue {

	int[] queue = new int[5];
	int size;
	int front;
	int rear;

	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		}
	}

	public int deQueue() {
		int data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size = size - 1;
		}
		return data;
	}

	public void show() {
		System.out.print("Elements : ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == queue.length;
	}

}
