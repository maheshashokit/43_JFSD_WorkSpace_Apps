package com.ashokit.threads;

import java.sql.Time;
import java.time.LocalTime;

public class NaturalNumberTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Natural Numbers Thread Name:::" + LocalTime.now());
		for(int i=1 ; i<=20; i++) {
		  System.out.println("Natural Number i =" + i);
		}
	}
}
