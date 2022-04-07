package com.myapp.stack;

public class StackTester {
	public static void main(String[] args) {
		Stack1 s = new Stack1();
		s.push(1);
		s.push(2);
		s.push(3);
		s.show();
		System.out.println();
		System.out.print(s.pop());
		System.out.println();
		s.show();
		s.push(4);
		
		//System.out.println(s.pop());
		//System.out.println(s.size());
		//System.out.println(s.isEmpty());
		System.out.println();
		
		s.show();

	}

}
