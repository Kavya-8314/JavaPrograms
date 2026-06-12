package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of rows:");
	int rows=sc.nextInt();
	System.out.println("Enter the no.of cols:");
	int cols=sc.nextInt();
	int a[][]=new int[rows][cols];
	System.out.println("Enter the elements:");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println(Arrays.deepToString(a));
}
}
