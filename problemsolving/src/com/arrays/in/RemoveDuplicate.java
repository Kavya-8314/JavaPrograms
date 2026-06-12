package com.arrays.in;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
  public static void main(String[] args) {
	int arr[]= {10,20,30,30,20,10,40,50};
	ArrayList<Integer> list=new ArrayList<>();
//	System.out.println(list);
	for(int i=0;i<arr.length;i++) {
		if(!list.contains(arr[i])) {
			list.add(arr[i]);
		}
	}
	System.out.println(list);
	
	
}
}
