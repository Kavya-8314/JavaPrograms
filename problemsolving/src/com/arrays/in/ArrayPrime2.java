package com.arrays.in;

public class ArrayPrime2 {
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		boolean status=true;
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				status=false;
			}
		}
		return status;
	}
    public static void main(String[] args) {
    	int num=23;
		System.out.println(isPrime(num));
	}
    
} 
