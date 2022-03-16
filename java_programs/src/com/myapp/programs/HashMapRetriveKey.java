package com.myapp.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapRetriveKey {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();

		map.put("abc", "123");
		map.put("xyz", "456");

		for (Entry<String, String> value : map.entrySet()) {
			//if (value.getValue().equalsIgnoreCase("456")) {
				System.out.println(value.getKey());
			//}
		}
	}

}
