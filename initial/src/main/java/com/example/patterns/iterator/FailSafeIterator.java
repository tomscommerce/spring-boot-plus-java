package com.example.patterns.iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
	
	private static String email;
	static {
		System.out.println("hello");
		email = "hello";
	}
	
	    public static void main(String[] args) 
	    { 
	  
	        // Creating a ConcurrentHashMap 
	        Map<String, Integer> map 
	            = new ConcurrentHashMap<String, Integer>(); 
	  
	        map.put("ONE", 1); 
	        map.put("TWO", 2); 
	        map.put("THREE", 3); 
	        map.put("FOUR", 4); 
	  
	        // Getting an Iterator from map 
	        Iterator it = map.keySet().iterator(); 
	  
	        while (it.hasNext()) { 
	            String key = (String)it.next(); 
	            System.out.println(key + " : " + map.get(key)); 
	  
	            // This will reflect in iterator. 
	            // Hence, it has not created separate copy 
	            map.put("SEVEN", 7); 
	        }
	        
            System.out.println(map.keySet()); 

	    } 
	} 

