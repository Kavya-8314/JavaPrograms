package com.arrays.in;

public class PrimeNumber {
	
 public static void main(String[] args) {
	int num=2;
	boolean isPrime=true;
	if(num<2) {
		isPrime=false;
	}
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
	System.out.println((isPrime)?"Prime Number":"Not a Prime number");
}
}
