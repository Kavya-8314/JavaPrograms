package com.arrays.in;

import java.util.Arrays;

public class ArrayReverseProblem {
 public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int c[]=new int[a.length];
	int j=0;
	for(int i=a.length-1;i>=0;i--) {
		c[j++]=a[i];
	}
	System.out.println(Arrays.toString(c));
	
}
}
