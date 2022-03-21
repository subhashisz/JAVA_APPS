package com.myapp.programs;

public class LoopLinkedList {

	// Write a program to find if there is a loop inside a LinkedList

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	boolean hasLoop(Node first) {
		Node slow = first;
		Node fast = first;

		while (fast != null && fast.next != null) {
			slow = slow.next; // 1 hop
			fast = fast.next.next; // 2 hops
			if (slow == fast) // fast caught up to slow, so there is a loop
				return true;
		}
		return false; // fast reached null, so the list terminates
	}

	public static void main(String[] args) {

	}
}
