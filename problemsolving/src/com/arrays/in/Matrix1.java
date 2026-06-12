package com.arrays.in;

import java.util.Scanner;

public class Matrix1 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array elements:");
	int rows=3;
	int columns=3;
	int a[][]=new int [rows][columns];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println(a.length);
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
