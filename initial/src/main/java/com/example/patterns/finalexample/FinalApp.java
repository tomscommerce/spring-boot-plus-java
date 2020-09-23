package com.example.patterns.finalexample;

public class FinalApp {
	public static void main(String[] args ) {
		FinalImmutableReadOnly finalImmutableReadOnly = new FinalImmutableReadOnly("tom@tom.com");
		finalImmutableReadOnly.setEmail("abc@abc.com");
		finalImmutableReadOnly.email = "abc";
		System.out.println(finalImmutableReadOnly.getEmail());
		
	}

}
