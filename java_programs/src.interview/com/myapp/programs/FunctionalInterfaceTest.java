package com.myapp.programs;

interface Implementable {

	default void m() {

	}

	static void m1() {

	}
}

@FunctionalInterface
public interface FunctionalInterfaceTest extends Implementable {

	public void abst();

	@Override
	default void m() {

	}

	static void m1() {

	}

}
