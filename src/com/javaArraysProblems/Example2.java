package com.javaArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		List listOfValues = new ArrayList();

		//add
		listOfValues.add(12);
		listOfValues.add(45.45);//add new value
		listOfValues.add("Hello");
		listOfValues.add(true);
		listOfValues.add(null);
		listOfValues.add(23);

		System.out.println(listOfValues);		
		System.out.println("-----------------------------------------------");

		//remove
		listOfValues.remove(0);

		System.out.println(listOfValues);

		System.out.println("-----------------------------------------------");

		//add value at any index position
		listOfValues.add(2, 50);
		System.out.println(listOfValues);

		System.out.println("-----------------------------------------------");

		//update any value
		listOfValues.set(3, 100);
		System.out.println(listOfValues);

		System.out.println("---------------------get the size--------------------------");

		System.out.println(listOfValues.size());

		System.out.println("----------------------get the value-------------------------");

		//get the values from the collections
		System.out.println(listOfValues.get(1));
		
		System.out.println("---------------------get all values from collections--------------------------");
		
		for(int i = 0; i < listOfValues.size(); i++)
		{
			System.out.println(listOfValues.get(i));
		}
		
	}

}
