package com.arrays.in;

import java.util.Arrays;

public class JaggedArray {
 public static void main(String[] args) {
	int rows=3;
	int a[][]=new int[rows][];
	a[0]=new int[3];
	a[1]=new int[1];
	a[2]=new int[2];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[2][0]=5;
	a[2][1]=6;
	System.out.println(Arrays.deepToString(a));
	
}
}
