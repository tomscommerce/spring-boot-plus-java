package com.example.patterns.synchronize;

public class SyncApp {
	public static void main(String[] args) {
		Synchronized sync = new Synchronized("tom@tom.com");
		sync.process();
		System.out.println(sync.getEmail());
	}

}
