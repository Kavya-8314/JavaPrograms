package com.arrays.in;

public class SecondLargestWithoutSorting {
   public static void main(String[] args) {
	int a[]= {10, 45, 67, 23, 67, 89};
	int max=0,max2=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max2=max;
			max=a[i];
		}
		if(max>a[i]&&max2<a[i]) {
			max2=a[i];
		}
		
	}
	System.out.println(max2);
	
}
}
