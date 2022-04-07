package com.myapp.list;

public class MyList2 {

	// arr is the array which stores
	// our ArrayList elements
	private int arr[];

	// capacity is the total storage
	// capacity of the ArrayList
	private int capacity;

	// current is the number of elements
	// currently present in the ArrayList
	private int current;

	// Default constructor to initialise
	// an initial capacity of 1 element and
	// allocating storage using dynamic allocation
	public MyList2() {
		arr = new int[1];
		capacity = 1;
		current = 0;
	}

	// Function to add an element at the last
	public void add(int data) {

		// if the number of elements
		// is equal to the capacity,
		// that means we don't have space
		// to accommodate more elements.
		// We need to double the capacity
		if (current == capacity) {
			int temp[] = new int[2 * capacity];

			// copying old array elements
			// to new array
			for (int i = 0; i < capacity; i++)
				temp[i] = arr[i];

			capacity *= 2;
			arr = temp;
		}

		// Inserting data
		arr[current] = data;
		current++;
	}

	// function to add element at any index
	void add(int data, int index) {

		// if index is equal to capacity
		// then this function is same
		// as push defined above
		if (index == capacity)
			add(data);
		else
			arr[index] = data;
	}

	// Function to extract
	// element at any index
	int get(int index) {

		// if index is within the range
		if (index < current)
			return arr[index];

		// if index is outside the range
		return -1;
	}

	// function to delete last element
	void pop() {
		current--;
	}

	// function to get size
	// of the ArrayList
	int size() {
		return current;
	}

	// function to get capacity
	// of the ArrayList
	int getcapacity() {
		return capacity;
	}

	// function to print ArrayList elements
	void print() {
		for (int i = 0; i < current; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
