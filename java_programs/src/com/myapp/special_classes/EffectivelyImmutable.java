package com.myapp.special_classes;

public class EffectivelyImmutable {
	final boolean canChange;
	private int x;

	EffectivelyImmutable(boolean canChange) {
		this.canChange = canChange;
	}

	public void setX(int newX) {
		if (canChange) {
			this.x = newX;
		} else {
			throw new IllegalStateException();
		}
	}
}