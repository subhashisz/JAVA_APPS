package com.myapp.factory;

public class Audi implements Car {

	private String name;


	public Audi(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Mercediz [name=" + name + "]";
	}

}
