package com.myapp.special_classes;

public class ObjectBuilder {

	private final int id;
	private final String names;
	private final int age;
	private final String hAddress;
	private final String oAddress;

	public static class Builder {
		// Required parameters
		private final int id;
		private final String name;
		// Optional parameters - initialized to default values
		private int age = 0;
		private String hAddress = "";
		private String oAddress = "";

		public  Builder(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public Builder age(int val) {
			age = val;
			return this;
		}

		public Builder hAddress(String val) {
			hAddress = val;
			return this;
		}

		public Builder oAddress(String val) {
			oAddress = val;
			return this;
		}

		public ObjectBuilder build() {
			return new ObjectBuilder(this);
		}
	}

	public ObjectBuilder(Builder builder) {
		id = builder.id;
		names = builder.name;
		age = builder.age;
		hAddress = builder.hAddress;
		oAddress = builder.oAddress;

	}
}

class Another {
	public static void meth() {
		new ObjectBuilder.Builder(1, "").age(5).hAddress("").oAddress("").build();
	}
}
