package com.javaKeyValueBasedCollections;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print student name and marks using Map collections
		 * 
		 * Name - String
		 * Marks - Float
		 * 
		 */
		
		Map<String, Float> studentDetails = new HashMap<String, Float>();
		
		studentDetails.put("Satish", 56.45f);
		studentDetails.put("Anil", 86.45f);
		studentDetails.put("Ganesh", 77.45f);
		studentDetails.put("Javed", 56.33f);
		studentDetails.put("John", 44.66f);
		
		System.out.println(studentDetails);		
		

	}

}
