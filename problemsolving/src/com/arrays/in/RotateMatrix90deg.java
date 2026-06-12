package com.arrays.in;

import java.util.Arrays;

public class RotateMatrix90deg {
  public static void main(String[] args) {
	int a[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=a[j][i];
		}
	}
//	System.out.println(Arrays.deepToString(a));
	for(int i=0;i<a.length;i++) {
		
	}
}
}
