package com.arrays.in;

import java.util.Scanner;

public class ArrayEven {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
//		if(a[i]%2==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
}
