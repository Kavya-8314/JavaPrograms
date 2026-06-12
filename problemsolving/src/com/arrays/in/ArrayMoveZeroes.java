package com.arrays.in;

import java.util.Arrays;

public class ArrayMoveZeroes {
   public static void main(String[] args) {
	int a[]= {1,2,0,5,0,7,0};
	int c[]=new int[a.length];
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			c[j++]=a[i];
		}
	}
	System.out.println(Arrays.toString(c));
}
}
