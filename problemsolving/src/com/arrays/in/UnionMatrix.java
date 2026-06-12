package com.arrays.in;

import java.util.Arrays;

public class UnionMatrix {
 public static void main(String[] args) {
	int a[][]= {
			{1,2},
			{3,4}
	};
	int b[][]= {
			{5,6},
			{7,8}
	};

	int col=a[0].length+b[0].length;
	int c[][]=new int[a.length][col];
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			c[i][j]=a[i][j];
		}
		
	}
	for(int i=0;i<b.length;i++) {
       for(int j=0;j<a[i].length;j++) {
    	      c[i][j+a[0].length]=b[i][j];
       }																																																																																											
      
	}
//	System.out.println(Arrays.deepToString(c));
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(c[i][j]+ " ");
		}
		System.out.println();
	}
}
}
