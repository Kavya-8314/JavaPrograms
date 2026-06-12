package com.arrays.in;

import java.util.Arrays;

public class ArraytoJaggedArray {
 public static void main(String[] args) {
	int normal[]= {1,2,3,4,5,6};
	int jagged[][]=new int[3][];
	jagged[0]=new int[3];
	jagged[1]=new int[1];
	jagged[2]=new int[2];
	int k=0;
	for (int i = 0; i < jagged.length; i++) {
		for (int j = 0; j < jagged[i].length; j++) {
			jagged[i][j]=normal[k++];
		}
	}
	System.out.println(Arrays.deepToString(jagged));
	
}
}
