package com.arrays.in;

public class ScalarMatrix {
  public static void main(String[] args) {
	int a[][]= {
			{1,0,0},
			{0,1,0},
			{0,0,1}
	};
	boolean isScalar=true;
	int diagonal=a[0][0];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if((i!=j&&a[i][j]!=0)||(i==j&&a[i][j]!=diagonal)) {
				isScalar=false;
			}
		}
	}
	if(isScalar) {
		System.out.println("Scalar Matrix");
	}else {
		System.out.println("Not a Scalar Matrix");
	}
}
}
