package com.myapp.queue;

public class QueueTester {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		q.deQueue();
		
		q.show();
	}

}
