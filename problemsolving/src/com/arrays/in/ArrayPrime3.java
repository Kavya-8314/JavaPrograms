package com.arrays.in;

import java.util.Arrays;

public class ArrayPrime3 {
   public static void main(String[] args) {
	int a[]= {1,2,3,4,56,78,12,23,34,5,9};
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(isPrime(a[i])) count++;
		
	}
	int b[]=new int[count];
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(isPrime(a[i])) 
		b[j++]=a[i];
	}
	System.out.println(Arrays.toString(b));
	
}
   public static boolean isPrime(int num) {
	   if(num<2)return false;
	   for(int i=2;i<num;i++) {
		   if(num%i==0) {
			   return false;
		   }
	   }
	   
	   return true;
   }
}
