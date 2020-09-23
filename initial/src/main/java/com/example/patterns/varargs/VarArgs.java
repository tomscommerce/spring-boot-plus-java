package com.example.patterns.varargs;

import java.util.Arrays;

public class VarArgs {
	
	volatile int counter; //multi-threading variable shared across CPU cores

	
	public void  varMethod (String myArg1, String... myArgs) {
		System.out.println("arg1=" + myArg1 + ", myArgs=" + Arrays.asList(myArgs));
	}
	
	public static void main(String[] args) {
		VarArgs varArgs = new VarArgs();
		varArgs.varMethod("arg1", "arg2", "arg3");
		
		String str= "abc";
		System.out.println(str.length());
		
		
	}

}
