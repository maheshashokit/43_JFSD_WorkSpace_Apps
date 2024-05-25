package com.ashokit.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRefDemo {

	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		// 2. Method reference to a static method of a class
		Function<Integer, Double> sqrt = (Integer input) -> Math.sqrt(input);
		System.out.println(sqrt.apply(4));

		Function<Integer, Double> sqrtRef = Math::sqrt;
		System.out.println(sqrtRef.apply(4));

		BiFunction<Integer, Integer, Integer> functionLambda = (a, b) -> MethodRefDemo.addition(a, b);
		System.out.println(functionLambda.apply(10, 20));

		BiFunction<Integer, Integer, Integer> function = MethodRefDemo::addition;
		System.out.println(function.apply(10, 20));
	}
}
