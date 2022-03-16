package com.myapp.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayArrayList {

	public List<Object> removeDuplicate(List<Object> arg) {
		List<Object> result = new ArrayList<>();
		for (Object o : arg) {
			if (!result.contains(o)) {
				result.add(o);
			}
		}
		return result;

	}

	public List<String> removeDuplicateJava8(List<String> aList) {
		return aList.stream().distinct().collect(Collectors.toList());
	}

}
