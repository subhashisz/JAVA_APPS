package com.myapp.special_classes;

public class CopyConstructor {

	private final int id;
	private final String name;

	public CopyConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CopyConstructor(CopyConstructor copy) {
		id = copy.id;
		name = copy.name;
	}

}


