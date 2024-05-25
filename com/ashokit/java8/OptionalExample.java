package com.ashokit.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		String value = "Hello, World!";

		Optional<String> optionalValue = Optional.ofNullable(value);

		// Check if value is present
		if (optionalValue.isPresent()) {
			System.out.println("Value is present: " + optionalValue.get());
		} else {
			System.out.println("Value is absent");
		}

		// Perform an action if value is present
		optionalValue.ifPresent(val -> System.out.println("Action performed on value: " + val.toUpperCase()));

		// Retrieve the value or a default value
		String retrievedValue = optionalValue.orElse("Default Value");
		System.out.println("Retrieved value: " + retrievedValue);

		// Map the value if present
		Optional<Integer> lengthOptional = optionalValue.map(eachValue -> eachValue.length());
		lengthOptional.ifPresent(len -> System.out.println("Length of value: " + len));

		// Filter the value
		Optional<String> filteredOptional = optionalValue.filter(val -> val.contains("Hello"));
		filteredOptional.ifPresent(val -> System.out.println("Filtered value: " + val));

		// Example of an empty Optional
		Optional<String> emptyOptional = Optional.empty();
		System.out.println("Empty Optional: " + emptyOptional.isPresent());
		String defaultValue = emptyOptional.orElse("Default Value");
		System.out.println("Retrieved value from empty Optional: " + defaultValue);
	}
}
