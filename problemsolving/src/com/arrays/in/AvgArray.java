package com.arrays.in;

public class AvgArray {
   public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	int sum=0;
	for(int b:a) {
		sum+=b;
		
	}
	System.out.println("avg:"+ (sum/a.length));
}
}
