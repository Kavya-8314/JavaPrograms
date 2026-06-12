package com.arrays.in;

import java.util.Arrays;

public class ArraySort {
   public static void main(String[] args) {
	int a[]= {9,7,6,10,4,2,5,1,3,8};
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	System.out.println(Arrays.toString(a));
//	   Arrays.sort(a);
//	   System.out.println(Arrays.toString(a));
	
}
}
