package com.arrays.in;

public class ArrayDuplicate {
   public static void main(String[] args) {
	int a[]= {10,20,50,30,90,80,10,50,20};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i] );
				break;
			}
		}
	}	
}
}
