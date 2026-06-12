package com.exceptionhandling.in;

public class Exception2 {
  public static void main(String[] args) {
	  System.out.println("Main Starts");
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[0]);
		System.out.println("Main Ends");
		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
}
}
