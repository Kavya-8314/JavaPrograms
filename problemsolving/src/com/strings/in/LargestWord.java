package com.strings.in;

public class LargestWord {
  public static void main(String[] args) {
	String str="Java Programming Language";
	String arr[]=str.split(" ");
	String largest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(largest.length()<arr[i].length()) {
			largest=arr[i];
		}
	}
	System.out.println(largest);
}
}
