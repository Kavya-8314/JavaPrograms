package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class JagagedTables {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int jagged[][]=new int[5][];
	for (int i = 0; i < jagged.length; i++) {
		 jagged[i]=new int[i+1];
		for (int j = 0; j < jagged[i].length; j++) {
			jagged[i][j]=(i+1)*(j+1);
		}
	}
	
	System.out.println(Arrays.deepToString(jagged));
}
}

