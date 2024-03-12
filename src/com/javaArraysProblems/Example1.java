package com.javaArraysProblems;

public class Example1 {

	public static void main(String[] args) {
		
		int values[] = new int[5];
		
		values[0] = 34;
		values[1] = 74;
		values[2] = 89;
		values[3] = 22;
		values[4] = 66;
		//values[5] = 66.45f;
		
		for(int value: values)
		{
			System.out.println(value);
		}

	}

}
