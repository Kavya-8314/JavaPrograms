package com.arrays.in;

public class DiagonalMatrix {
  public static void main(String[] args) {
	int a[][]= {
			{1,4,0},
			{0,2,0},
			{0,0,3}
	};
	boolean isDiagonal=true;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(i!=j&&a[i][j]!=0) {
				isDiagonal=false;
			}
		}
		
	}
	if(isDiagonal) {
		System.out.println("Diagonal Matrix");
	}else {
		System.out.println("Not a Diagonal Matrix");
	}
}
}
