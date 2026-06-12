package com.strings.in;

public class ReverseStringArray {
  public static void main(String[] args) {
	String str[]= {"Running","Walking","Sleeping","Eating"};
	for(int i=0;i<str.length;i++) {
		String rev="";
		for(int j=str[i].length()-1;j>=0;j--) {
			rev+=str[i].charAt(j);
		}
		System.out.println(rev);
	}
	
}
}
