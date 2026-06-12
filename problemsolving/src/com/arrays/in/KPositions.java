package com.arrays.in;

import java.util.Arrays;

public class KPositions {
   public static void main(String[] args) {
	   int a[]= {1,2,3,4,5};
	reverse(a,0 ,a.length-1 );
	reverse(a,0,1);
	reverse(a,2,a.length-1);
	System.out.println(Arrays.toString(a));
	
	
   }
   public static void reverse(int a[],int start,int end) {
	   while(start<end) {
		   int temp=a[start];
		   a[start]= a[end];
		   a[end]=temp;
		   start++;
		   end--;
	   }
   }
}


