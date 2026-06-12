package com.arrays.in;

public class ArrayTargetSum {
   public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int target=10;
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]+a[j]==target) {
				System.out.println("("+a[i]+" ,"+a[j]+")");
			}
		}
		
	}
}
}
