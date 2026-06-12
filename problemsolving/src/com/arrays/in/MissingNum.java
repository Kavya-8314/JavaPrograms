package com.arrays.in;import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5,9,10};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		int p=max;
		while(p>=1) {
			boolean isContains=false;
			for(int i=0;i<a.length;i++) {
				if(p==a[i]) {
					isContains=true;
					break;
				}
			}
			if(!isContains) {
				System.out.println(p);
				
			}
			p--;
		}
		
	}
}
