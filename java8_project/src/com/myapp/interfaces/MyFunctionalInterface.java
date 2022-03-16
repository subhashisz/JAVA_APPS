package com.myapp.interfaces;

import java.util.function.Consumer;

@FunctionalInterface
public interface MyFunctionalInterface<T, R> {

	public R convert(Consumer<T> c);

	public default String and() {
		return "Hello World";
	}

	public default String andThen() {
		return "Hello World";
	}

	public static void ifSatisfies() {

	}

}
