package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedMarks {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][];
	for(int i=0;i<a.length;i++) {
		System.out.println("Enter the no.of columns for the row "+(i+1)+":");
		int cols=sc.nextInt();
		a[i]=new int[cols];
		System.out.println("Enter the elements:");
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
		
	}
	System.out.println(Arrays.deepToString(a));
	for (int i = 0; i < a.length; i++) {
		System.out.print("Class "+(i+1)+" Scored ");
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
	
}
} 
