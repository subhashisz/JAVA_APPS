package com.myapp.linked_list;

public class Runner {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insertAtFirst(5);
		list.insertAtIndex(0, 6);
		list.deleteAt(2);
		list.show();

	}

}
