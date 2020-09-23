package com.example.patterns.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static final Singleton getInstance() {
		if ( Singleton.singleton == null )
			Singleton.singleton = new Singleton();
		return Singleton.singleton;
	}
}
