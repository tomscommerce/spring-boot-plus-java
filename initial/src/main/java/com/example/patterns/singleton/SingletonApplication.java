package com.example.patterns.singleton;


public class SingletonApplication {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}

}
