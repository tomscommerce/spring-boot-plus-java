package com.example.patterns.defaults;

public class MyAdder implements DefaultAdder {

	@Override
	public <K extends Number> K addNumbers(K a, K b) {
		return DefaultAdder.super.addNumbers(a, b);
	}
	
	

}
