package com.exceptionhandling.in;

public class StringIndexOutOfBounds {
  public static void main(String[] args) {
	String s="Hello";
//	System.out.println(s.charAt(5));
	try {
		System.out.println(s.charAt(5));
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	finally {
		System.out.println("Today is Saturday....Lets go home and sleep");
	}
}
}
