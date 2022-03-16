package com.myapp.factory;

public class TestCar {

	public static void main(String[] args) {

		CarFactory cars = new CarFactory();

		System.out.println(cars.create("mercediz").orElse(new Audi("")));
	}

}
