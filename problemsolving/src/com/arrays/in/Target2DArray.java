package com.arrays.in;

import java.util.Iterator;
import java.util.Scanner;

public class Target2DArray {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rows=3;
	int columns=3;
	int a[][]=new int[rows][columns];
	System.out.println("Enter the elements:");
	for (int i = 0; i <rows; i++) {
		for (int j = 0; j <columns; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int target=6;
	boolean found=false;
	for (int i = 0; i < rows; i++) {
	 for (int j = 0; j < columns; j++) {
		if(a[i][j]==target) {
			found=true;
			break;
		}
	}
	}
	if(found) {
		System.out.println(target+" is found in the matrix");
	}else {
		System.out.println(target+" is not found in the matrix");
	}
}
}
