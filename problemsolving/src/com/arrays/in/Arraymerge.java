package com.arrays.in;

import java.util.Arrays;

public class Arraymerge {
   public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b[]= {1,2,3,4,5};
	int size=a.length+b.length;
	int c[]=new int[size];
	int j=0;
	for(int i=0;i<a.length;i++) {
		c[j++]=a[i];
	}
	for(int i=0;i<a.length;i++) {
		c[j++]=b[i];
	}
	System.out.println(Arrays.toString(c));
}
}
