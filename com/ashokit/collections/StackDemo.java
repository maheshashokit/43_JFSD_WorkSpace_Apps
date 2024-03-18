package com.ashokit.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		// Pushing elements onto the stack
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");

		System.out.println("Stack Data:::::" + stack);
		
		// Popping elements from the stack
		String element = (String) stack.pop(); // Removes "Cherry" from the stack
		System.out.println("Removed Element::::" + element);
		System.out.println("Stack Data :::::" + stack);
		
		// Peeking the top element
		String topElement = (String) stack.peek(); // Returns "Banana" without removing it
		System.out.println("Retreiving Top Most Element of Stack ::::" + topElement);
		
		// Checking if the stack is empty
		boolean isEmpty = stack.empty(); // Returns false
		System.out.println("Checking Stack Elements::::" + isEmpty);

		// Searching for an element
		int position = stack.search("Apple"); // Returns 2 (1-based index)
		System.out.println("Search Element Position::::" + position);

		// Printing the stack
		System.out.println(stack); // Outputs: [Apple, Banana]
		
		// call List specific methods
		Stack<String> clonedStack = (Stack<String>) stack.clone();
		System.out.println("Cloned Stack ::::" + clonedStack);

		// clearing elements from Stack
		stack.clear();

		System.out.println("Stack Data:::::" + stack);
		System.out.println("Checking Stack Elements:::::" + stack.isEmpty());

		stack.addAll(clonedStack);
		System.out.println("Adding ELements to main stack from Cloned stack:::::" + stack);
		System.out.println("clonedStack=" + clonedStack);
		Stack st1 = new Stack();
		st1.addAll(0, stack);// will check on addAll()
		st1.add(1, "Orange");
		st1.add(2, "Orange");
		System.out.println("Stack Data::::" + st1);
		System.out.println("st1=" + st1.search("Apple"));
		System.out.println("st1=" + st1.search("Orange"));
		System.out.println("st1=" + st1.search("Banana"));
	}
}