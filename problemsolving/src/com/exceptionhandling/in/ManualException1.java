package com.exceptionhandling.in;

import java.util.Scanner;

public class ManualException1 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element a:");
		int a=sc.nextInt();
		System.out.println("Enter the element b:");
		int b=sc.nextInt();
		if(a<b) {
			throw new ArithmeticException("a is less than b,so subtraction is not possible");
		}
		
}
}
