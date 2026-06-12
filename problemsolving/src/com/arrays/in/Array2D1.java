package com.arrays.in;

import java.util.Arrays;

public class Array2D1 {
 public static void main(String[] args) {
	int a[]=null;
	 if(a==null) {
		 int a1[]=new int[3];
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+1;
		}
		int b1[]=new int[3];
		for(int i=0;i<b1.length;i++) {
			b1[i]=i+4;
		}
		int c1[]=new int[3];
		for(int i=0;i<c1.length;i++) {
			c1[i]=i+7;
		}
		int d[]=new int[a1.length+b1.length+c1.length];
		int j=0;
		for(int i=0;i<a1.length;i++) {
			d[j++]=a1[i];
		}
		for(int i=0;i<b1.length;i++) {
			d[j++]=b1[i];
		}
		for(int i=0;i<c1.length;i++) {
			d[j++]=c1[i];
		}
		System.out.println(Arrays.toString(d));
	}
	 
}
}
