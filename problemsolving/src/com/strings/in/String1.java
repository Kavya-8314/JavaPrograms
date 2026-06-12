package com.strings.in;

public class String1 {
  public static void main(String[] args) {
	String s="ABCDEF";
	for (int i = 0; i < s.length(); i++) {
		for (int j = i; j < s.length(); j++) {
			String sub=s.substring(i, j+1);
//			System.out.println(s.substring(i, j+1));
			if(sub.length()==4) {
				System.out.println(sub);
			}
		}
	}
	
	
	
}
}
