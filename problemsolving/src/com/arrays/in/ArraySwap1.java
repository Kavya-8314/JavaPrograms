package com.arrays.in;

import java.util.Arrays;

public class ArraySwap1 {
   public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70};
	for(int i=0;i<a.length-1;i+=3) {
		int temp=a[i];
		a[i]=a[i+2];
		a[i+2]=temp;
	}
	System.out.println(Arrays.toString(a));
}
}
