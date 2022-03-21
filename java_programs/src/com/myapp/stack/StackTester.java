package com.myapp.stack;

public class StackTester {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		s.push(4);
		
		//System.out.println(s.pop());
		//System.out.println(s.size());
		//System.out.println(s.isEmpty());
		
		s.show();

	}

}
