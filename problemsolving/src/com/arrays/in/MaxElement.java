package com.arrays.in;

public class MaxElement {
   public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int max=0;
//	for(int i=0;i<a.length;i++) {
//		if(a[i]>max) {
//			max=a[i];
//					
//		}
//	}
//	System.out.println(max);
	for(int j:a) {
		if(j>max) {
			max=j;
		}
	}
	System.out.println(max);
}
}
