package com.arrays.in;

public class ArrayPerfect {
   public static void main(String[] args) {
	int a[]= {1,3,6,5,12,28,34};
	for(int i=0;i<a.length;i++) {
		int num=a[i];
		int sum=0;
		for(int j=1;j<=a[i]/2;j++) {
			if(num%j==0) {
				sum+=j;
			}
			
		}
		if(sum==a[i]) {
			System.out.println(a[i]);
		}
	}
}
}
