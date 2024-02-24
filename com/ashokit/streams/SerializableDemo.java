package com.ashokit.streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		   ){
			
			Employee emp = new Employee("AIT123","Mahesh","SSE");
			Employee emp1 = new Employee("AIT345","Ashok","TL");
			
			oos.writeObject(emp);
			oos.writeObject(emp1);
			
			System.out.println("Object Serialiazation is Completed.....");
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}