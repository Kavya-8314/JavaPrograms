package com.arrays.in;

import java.util.Scanner;

public class DiagonalSumArray {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rows=3;
	int columns=3;
	int a[][]=new int[rows][columns];
	System.out.println("Enter the elemnts:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int sum=0;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			if(i==j) {
				sum+=a[i][j];
			}
			
		}
		
	}
	System.out.println(sum);
	
}
}
