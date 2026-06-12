package com.strings.in;

public class SringsSeparateNum {
   public static void main(String[] args) {
	String s="HIM2N345C@1!34O";
	int sum=0;
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
//			System.out.println(s.charAt(i));
			int num=s.charAt(i)-'0';
			sum+=num;
		}
	}
	System.out.println(sum);
}
}
