package com.strings.in;

public class BananaFrequency {
  public static void main(String[] args) {
	String str="Banana";
   for(int i=0;i<str.length();i++) {
		int count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				
			}
		}
//		System.out.println(str.charAt(i)+" "+count);
		if(str.indexOf(str.charAt(i))==i) {
			System.out.println(str.charAt(i)+"="+count);
		}
	}
}
}
