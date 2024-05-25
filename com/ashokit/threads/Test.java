package com.ashokit.threads;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream.generate( () -> {
		      return new Random().nextInt(1,5000);
		})
		.limit(20)
		.forEach(eachNumber  -> System.out.println(eachNumber));
		
		IntStream.range(1,21).forEach(eachNumber -> System.out.print(eachNumber +" "));
		
		System.out.println();
		
		IntStream.range(1,21).filter(eachNumber -> eachNumber % 2 != 0).forEach(eachNumber -> System.out.print(eachNumber+" "));

	}
}
