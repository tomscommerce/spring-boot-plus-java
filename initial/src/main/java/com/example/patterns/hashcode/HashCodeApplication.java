package com.example.patterns.hashcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashCodeApplication {

	public static void main(String[] args) throws IOException {
		HashCodeFail fail = new HashCodeFail("tom@tom.com");
		Map<Object,String> map = new HashMap<Object,String>();
		System.out.println(fail.hashCode());

		String x = map.put(fail, fail.getEmail());
		System.out.println("x=" + x);
		String failed = map.get(fail);
		System.out.println(fail.hashCode());
		System.out.println(fail.hashCode());
		System.out.println(failed);
		
		System.out.println("");

		fail.setEmail(null);
		System.out.println(fail.hashCode());
		x = map.put(fail,  fail.getEmail());
		System.out.println("x=" + x);
		failed = map.get(fail);
		System.out.println(fail.hashCode());
		System.out.println(failed);
	}

}
