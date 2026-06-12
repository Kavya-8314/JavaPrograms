package com.arrays.in;

public class ArrayTarget1D {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int key=9;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(key+" is present in the Array ");
		}else {
			System.out.println(key+" is not present in the Array");
		}
	}
}
