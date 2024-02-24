package com.ashokit.main;

import com.ashokit.Demo;
import com.ashokit.helper.DemoHelper;

import com.ashokit.services.DemoService;
import com.ashokit.services.TestService;

import com.ashokit.util.DemoUtils;


public class PackageTest {
	
	 public static void main(String[] args) {
		
		 //Accessing the DemoHelper
		 DemoHelper dh  = new DemoHelper();
		 
		 //Accessing Utilty class
		 DemoUtils du = new DemoUtils();
		 
		 //Accessing Services
		 DemoService ds = new DemoService();
		 TestService ts = new TestService();
		 
		 //Access class from jar file
		 Demo d = new Demo();
		 d.display();
		 
	}
}
