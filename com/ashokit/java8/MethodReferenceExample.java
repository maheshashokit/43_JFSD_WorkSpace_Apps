package com.ashokit.java8;

import java.util.function.Consumer;

public class MethodReferenceExample {
	public static void main(String[] args) {
		MyClass obj = new MyClass();

		// Using instance method reference
		Consumer<String> consumer = obj::instanceMethod;

		consumer.accept("Hello, world!");
	}
}
