package com.myapp.practices;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargExample {
	@SafeVarargs
	private void display(List<String>... products) { // Not using @SaveVarargs
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		SafeVarargExample p = new SafeVarargExample();
		List<String> list = new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		p.display(list);
	}
}
