package com.myapp.programs;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
	private static final long serialVersionUID = 1L;
	private static SingletonSerializable singleton = new SingletonSerializable();
	public int i = 1;

	private SingletonSerializable() {
	}

	public static SingletonSerializable getInstance() {
		return singleton;
	}

	public Object readResolve() {
		return getInstance();
	}

}