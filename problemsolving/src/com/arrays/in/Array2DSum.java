package com.arrays.in;

import java.util.Arrays;

public class Array2DSum {
  public static void main(String[] args) {
	int a[][]= {
			{1,2},
			{3,4}
	};
	int b[][]= {
			{1,2},
			{3,4}
	};
	int c[][]=new int[a.length][b.length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
//	System.out.println(Arrays.deepToString(c));
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(c[i][j]+" ");
			
		}
		System.out.println();
		
	}
}
}
