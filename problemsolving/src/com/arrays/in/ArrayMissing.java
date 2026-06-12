package com.arrays.in;
//It works for only one digit
public class ArrayMissing {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8,9,10};
		int sum=0,asum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		for(int i=0;i<a.length;i++) {
			asum+=a[i];
		}
		System.out.println(asum);
		System.out.println("Missing Number is:"+(sum-asum));
	}
} 
