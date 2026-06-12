package com.arrays.in;

import java.util.Arrays;

public class MoveZeroes {
 public static void main(String[] args) {
	int arr[]= {1,2,0,0,3,0,4,0,5};
	int arr1[]=new int[arr.length];
	int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr1[index++]=arr[i];
		}
	}
	System.out.println(Arrays.toString(arr1));
}
}
