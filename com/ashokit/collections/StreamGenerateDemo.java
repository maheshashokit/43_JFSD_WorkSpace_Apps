package com.ashokit.collections;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerateDemo {
	
	public static void main(String[] args) {
		
		//Defining the supplier for generating Random number
		 Supplier<Integer> randomSupplier = () -> {
			return new Random().nextInt(5000, 10000); 
		 };
		 
		 Stream<Integer> randomNumbers = Stream.generate(randomSupplier).limit(10);
		 
		 //Infinite elements
		 randomNumbers.forEach(eachNumber -> System.out.println(eachNumber));
		
	}

}
