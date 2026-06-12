package com.strings.in;

public class StringContains {
 public static void main(String[] args) {
	String str="Java";
	char ch='v';
//	if(str.contains(String.valueOf(ch))) {
//		System.out.println("Present");
//	}else {
//		System.out.println("Not Present");
//	}
	
	boolean found=false;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==ch) {
			found=true;
			break;
		}
	}
	if(found) System.out.println("Present");
	else System.out.println("Not present");
}
}
