package com.arrays.in;

public class ArrayStrong {
   public static void main(String[] args) {
	int a[]= {0,5,2,1,7,4,9};
	for(int i=0;i<a.length;i++) {
		int num=a[i];
		int original=num;
		int sum=0;
		if(num==0) {
			sum=1;
		}
		while(num>0) {
			int digit=num%10;
			int fact=1;
			for(int j=1;j<=digit;j++) {
				fact=fact*j;
			}
			sum+=fact;
		  num=num/10;
		}
		if(sum==original) {
			System.out.println(a[i]);
		}
		
	}
}
}
