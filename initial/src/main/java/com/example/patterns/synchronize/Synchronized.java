package com.example.patterns.synchronize;

import java.util.HashMap;
import java.util.Map;

public class Synchronized {
	
	private String email;
	private static String overrideEmail = "override@google.com";
	private static Map<String,Object> map = new HashMap<String, Object>();
	
	public Synchronized(String email) {
		this.email = email;
	}
	
	
	static {
		synchronized (map) {
			
		}
		
		
	}
	
	public static synchronized void getItem() {
		//do things to map
	}

	public static synchronized void setItem() {
		//do things to map
	}
	
	public static void doWork() {
	 //do things to map
		//this works
	}
	
	public void process() {
		synchronized (Synchronized.class) {
			//do things to map
			
		}
	}
	
	public String getEmail() {
		return this.email;
	}

}
