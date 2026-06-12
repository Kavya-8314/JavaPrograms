package com.exceptionhandling.in;

import java.util.Scanner;

public class ManualException {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element a:");
	int a=sc.nextInt();
	System.out.println("Enter the element b:");
	int b=sc.nextInt();
	try {
		if(a<b) {
			throw new Exception();
		}
		int result=a-b;
		System.out.println("Result:"+result);
	}
	 catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.out.println("a is less th b,so subtraction is not possible");
	}
	
}
}
