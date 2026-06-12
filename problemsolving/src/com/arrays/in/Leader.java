package com.arrays.in;

public class Leader {
 public static void main(String[] args) {
	int a[]= { 16, 17, 4, 3, 5, 2};
	int leader=a[a.length-1];
	System.out.print(leader+" ");
	for(int i=a.length-2;i>0;i--) {
		if(a[i]>leader) {
			leader=a[i];
			System.out.print(leader+" ");
		}
	}
	
}
}
