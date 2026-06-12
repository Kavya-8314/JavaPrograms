package com.arrays.in;

import java.util.Arrays;

public class Movezeroes1 {
 public static void main(String[] args) {
	int arr[]= {1,2,0,0,0,3,0,4};
	int i=0;
	int j=0;
	while(j<arr.length) {
		if(arr[j]!=0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
		}
		j++;
	}
	System.out.println(Arrays.toString(arr));
}
}
