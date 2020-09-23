package com.example.patterns.enumeration;

public class EnumApp {

	public static void main(String[] args) {
		Level currentLevel = Level.LOW;

		switch (currentLevel) {
		case LOW:
			System.out.println("low");
			break;
		default:
			System.out.println("unknown");
		}
	}

}
