package com.strings.in;

public class ReverseaString {
   public static void main(String[] args) {
	String str="Hello";
	String res="";
	for(int i=str.length()-1;i>=0;i--) {
		res+=str.charAt(i);
	}
	System.out.println(res);
}
}
