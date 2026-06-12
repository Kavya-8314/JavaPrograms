package com.arrays.in;

public class ArrayFreq {
   public static void main(String[] args) {
	int a[]= {10,40,20,30,40,50,40,60};
	int count=0;
	int target=40;
	for(int i=0;i<a.length;i++) {
		if(a[i]==target) {
			System.out.println(a[i]);
			count++;
		}
		
	}
	if(count>0) {
	System.out.println("Element is found and repeated for"+count+"times");
	}else {
		System.out.println("Element not found");
	}
}
}
