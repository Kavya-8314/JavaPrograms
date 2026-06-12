package com.arrays.in;

import java.util.Arrays;

public class SelectionSort {
   public static void main(String[] args) {
	int a[]= {23,1,4,89,7,65,98,53,21,39,89};
	for(int i=0;i<a.length;i++) {
		int minIndex=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[minIndex]>a[j]) {
				minIndex=j;
			}
		}
		  int temp=a[i];
		  a[i]=a[minIndex];
		  a[minIndex]=temp;
		}
	System.out.println(Arrays.toString(a));
}
} 
