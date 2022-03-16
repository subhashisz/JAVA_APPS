package com.myapp.factory;

public class Mercediz implements Car {

	private String name;
	

	public Mercediz(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Mercediz [name=" + name + "]";
	}

}
