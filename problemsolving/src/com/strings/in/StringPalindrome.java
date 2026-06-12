package com.strings.in;

public class StringPalindrome {
 public static void main(String[] args) {
	String str="madaM";
	str=str.toLowerCase();
	String res="";
//	for(int i=0;i<str.length();i++) {
//		res=str.charAt(i)+res;
//		
//	}
//	System.out.println(res);
	for(int i=str.length()-1;i>=0;i--) {
		res+=str.charAt(i);
	}
	if(res.equals(str)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
