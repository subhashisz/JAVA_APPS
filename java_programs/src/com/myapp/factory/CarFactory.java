package com.myapp.factory;

import java.util.Optional;

public class CarFactory {

	public Optional<Car> create(String carType) {
		Optional<Car> car = null;
		if (carType.equalsIgnoreCase("audi")) {
			car = Optional.of(new Audi("AUDI"));
		} else if (carType.equalsIgnoreCase("mercediz")) {
			car = Optional.of(new Mercediz("MERCEDIZ"));
		}
		return car;
	}

}
