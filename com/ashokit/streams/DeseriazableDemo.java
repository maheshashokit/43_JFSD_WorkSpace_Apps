package com.ashokit.streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeseriazableDemo {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);){
			
			//reading the object 
			Employee emp = (Employee) ois.readObject();
			emp.display();
			Employee emp1 = (Employee) ois.readObject();
			emp1.display();
			
			System.out.println("Object De-serialization Completed.....");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
