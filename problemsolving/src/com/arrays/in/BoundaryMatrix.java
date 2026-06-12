package com.arrays.in;

public class BoundaryMatrix {
  public static void main(String[] args) {
	int a[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int rows=a.length;
	int columns=a[0].length;
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[0][i]+ " ");
	}
	for (int i = 1; i < a.length; i++) {
		System.out.print(a[i][columns-1]+ " ");
	}
	for(int i=columns-2;i>=0;i--) {
		System.out.print(a[rows-1][i]+" ");
	}
	for (int i = rows-2; i >0 ; i--) {
		System.out.print(a[i][0]+" ");
	}
	
	
}
}
