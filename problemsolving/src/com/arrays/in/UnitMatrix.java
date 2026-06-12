package com.arrays.in;

public class UnitMatrix {
  public static void main(String[] args) {
	  int a[][]= {
				{1,0,0},
				{0,1,0},
				{0,0,1}
		};
		boolean isUnit=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if((i==j&&a[i][j]!=1)&&(i!=j&&a[i][j]!=0)) {
					isUnit=false;
				}
			}
		}
//     System.out.println((isUnit)?);		

}
}
