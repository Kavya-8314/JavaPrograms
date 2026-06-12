package com.arrays.in;

public class LinearSearch {
  public static void main(String[] args) {
	int a[]= {1,8,4,0,5,10,15};
	int target=6;
	boolean status=false;
	for(int i=0;i<a.length;i++) {
		if(a[i]==target) {
			status=true;
			break;
		}
	}
	if(status) {
		System.out.println("Element is found "+target);
	}else {
		System.out.println("Element is not found");
	}
}
}
