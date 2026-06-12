package com.strings.in;

public class TwoSum {
 public static void main(String[] args) {
	int nums[]= {1,6,9,2,4,8,7};
	int k=10;
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]+nums[j]==k) {
				System.out.println(i+" "+j);
			}
		}
	}
}
}
