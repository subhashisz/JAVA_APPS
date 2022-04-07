package com.myapp.list;

public class MyList {
	transient Object[] elementData; // A non-private to access the nested class
	private static final Object[] EMPTY_ELEMENTDATA = {}; // Initializing the ArrayList EMPTY_ELEMENTDATA
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {}; // Initializing it with the default capacity
																			// 10

	public MyList() {
		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA; // here, this keyword is returning the instance of
																// ArrayList
	}

	public MyList(int initialCapacity) // ArrayList Constructor invokes with the initialCapacity argument for the
										// initial Array
	{
		if (initialCapacity > 0) { // if the value is grater than 0, it will create a new object
			this.elementData = new Object[initialCapacity]; // new object creation
		} else if (initialCapacity == 0) {
			this.elementData = EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity); // if the value is <= 0, it will
																						// throw an
																						// IllegalArgumentException
		}
	}

}
