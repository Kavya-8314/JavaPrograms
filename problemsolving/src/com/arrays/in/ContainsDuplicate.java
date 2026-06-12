package com.arrays.in;

import java.util.Arrays;

public class ContainsDuplicate {
  public static void main(String[] args) {
	int arr[]= {1,2,3,4,1};
//	for(int i=0;i<arr.length;i++) {
//		int count=0;
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]==arr[j]) {
//				count++;
//			}
//		}
//		if(count>0) {
//			System.out.println("Contains Duplicate");
//		}
//	}
	
//	Arrays.sort(arr);
//	for(int i=1;i<arr.length;i++) {
//		if(arr[i]==arr[i-1]) {
//			System.out.println("Contains Duplicate");
//		}
//	}
	
	for(int i:arr) {
		int count=0;
		for(int j:arr) {
			if(i==j) {
				count++;
			}
		}
		if(count>=2) {
			System.out.println("Contains Duplicate");
			break;
		}
	}
	
	
}
}
