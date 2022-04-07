package com.myapp.linked_list;

public class LinkedList1 {
	class Node {
		int data;
		Node next;
	}

	Node head;

	public void insert(int item) {
		Node new_node = new Node();
		new_node.data = item;
		new_node.next = null;
		if (head == null) {
			head = new_node;
		} else {
			Node temp_node = head;
			while (temp_node.next != null) {
				temp_node = temp_node.next;
			}
			temp_node.next = new_node;
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
