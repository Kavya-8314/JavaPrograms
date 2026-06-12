package com.strings.in;

public class StringToken {
  public static void main(String[] args) {
	String str="Java1.2Pyth?on";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='?'||ch=='.') continue;
		
		System.out.print(ch+" ");
	}
}
}
