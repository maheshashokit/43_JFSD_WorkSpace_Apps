package com.ashokit.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//creating the LinkedList Object
		LinkedList ll = new LinkedList();
		
		//adding the elements
		ll.add("Suresh");
		ll.addFirst("Ashok");
		ll.add(12);
		ll.addLast("Mahesh");		
		//adding element at Middle
		ll.add(2, 25);	
		
		//printing Linked List Data
		System.out.println("LinkedList:::::" + ll);
		
		//Get method
		System.out.println("Get First Element::::" + ll.getFirst());
		System.out.println("Get Last Element::::" + ll.getLast());
		
		
		LinkedList ll1 = new LinkedList();
		Object peek = ll1.peek();
		Object peek2 = ll.peek();
		System.out.println("Calling Peek Method::::" + peek);
		System.out.println("Calling Peek2 Method::::" + peek2);
		System.out.println("Calling Peek First Method::::" + ll.peekFirst());//Ashok
		System.out.println("Calling Peek First Method::::" + ll1.peekFirst());//null
		System.out.println("Calling Peek Last Method ::::" + ll.peekLast());//Mahesh
		System.out.println("Calling Peek Last Method ::::" + ll1.peekLast());//null
		System.out.println();
		
		//calling poll()
		System.out.println("Calling poll()......." + ll.poll());
		System.out.println("Calling pollpoll()......." + ll);//Ashok
		System.out.println("Calling poll()......." + ll.pollFirst());
		System.out.println("Linked list Data:::::" + ll);//suresh
		System.out.println("Callingpoll()........... " + ll.pollLast());
		System.out.println("Linked List Data:::::" + ll);//mahesh
		
		//call list interface specific method
		System.out.println("Size Of Linked List::::"+ll.size());
		LinkedList clonedList = (LinkedList) ll.clone();
		System.out.println("Cloned Linked List:::::" + clonedList);
	}
}
