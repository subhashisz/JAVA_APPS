package com.myapp.datastructure;

public class MyList {

	int s, initialCapacity;
	Object[] arr;

	MyList() {
		s = 0;
		initialCapacity = 10;
		arr = new Object[initialCapacity];
	}

	public void add(Object item) {
		arr[s++] = item;

	}

	public Object get(int index) {
		return arr[index];
	}

}
