package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicJaggedArray {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows:");
	int rows=sc.nextInt();
	int a[][]=new int[rows][];
	for(int i=0;i<a.length;i++) {
		System.out.println("Enter the no.of columns for the row "+(i+1)+":");
		int cols=sc.nextInt();
		a[i]=new int[cols];
		System.out.println("Enter the elements:");
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println(Arrays.deepToString(a));
	
	
}
}
