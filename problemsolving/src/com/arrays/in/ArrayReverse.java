package com.arrays.in;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=a.length-1;i>=0;i--) {
     	System.out.println(a[i]);
//     	System.out.println(Arrays.toString(a));
    	
		
	}
//	System.out.println(Arrays.toString(a));
	
	
}
}
