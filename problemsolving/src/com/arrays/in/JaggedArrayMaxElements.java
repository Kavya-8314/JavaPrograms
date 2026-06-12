package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrayMaxElements {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int a[][]=new int[4][];
	for(int i=0;i<a.length;i++) {
		System.out.println("Enter the number of columns for the the row "+(i+1)+":");
		int cols=sc.nextInt();
		a[i]=new int[cols];
		System.out.println("Enter the elements:");
		for(int j=0;j<a[i].length;j++) {
		   a[i][j]=sc.nextInt();
		}
	}
	System.out.println(Arrays.deepToString(a));
	int max=a[0][0];
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++) {
			if(a[i][j]>max) {
				max=a[i][j];
			}
		}
	}
	System.out.println("Maximun element is: "+max);
	
	int maxlength=a[0].length;
	int rowNumber=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(a[i].length>a[0].length) {
				maxlength=a[i].length;
			    rowNumber=i;
			}
		}
	}
	System.out.println("Maximum no.of elements are: "+maxlength+"present in " +rowNumber+"index");
}
}
