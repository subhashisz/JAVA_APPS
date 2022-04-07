package com.myapp.linked_list;

public class LinkedList {
	class Node {

		int data;
		Node next;
	}

	Node head;

	public void insert(int item) {
		Node node = new Node();
		node.data = item;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtFirst(int item) {
		Node node = new Node();
		node.data = item;
		node.next = head;
		head = node;
	}

	public void insertAtIndex(int index, int item) {
		Node node = new Node();
		node.data = item;
		node.next = null;

		if (index == 0) {
			insertAtFirst(item);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}
