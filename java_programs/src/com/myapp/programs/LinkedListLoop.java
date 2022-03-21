package com.myapp.programs;

import java.util.HashSet;

public class LinkedListLoop {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static boolean detectLoop(Node testNode) {
		HashSet<Node> hSet = new HashSet<Node>();
		while (testNode != null) {
			// If we have already has this node
			// in hashmap it means their is a cycle
			// (Because you we encountering the
			// node second time).
			if (hSet.contains(testNode))
				return true;

			// If we are seeing the node for
			// the first time, insert it in hash
			hSet.add(testNode);

			testNode = testNode.next;
		}

		return false;
	}

	public static void main(String[] args) {
		LinkedListLoop list = new LinkedListLoop();

		list.push(20);
		list.push(4);
		list.push(15);
		list.push(10);

		// Create loop for testing
		list.head.next.next.next.next = list.head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
	}
}
