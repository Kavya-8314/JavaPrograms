package com.arrays.in;

import java.util.Arrays;

public class ArrayPrime {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++) {
			boolean isPrime=true;
			if(a[i]<2) {
				isPrime=false;
			}else {
				for( int j=2;j<=Math.sqrt(a[i]);j++) {
					if(a[i]%j==0) {
						isPrime=false;
					}
				}
			}
			if(isPrime)
				System.out.print(a[i]+" ");
		}
		
	}
}
