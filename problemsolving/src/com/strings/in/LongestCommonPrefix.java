package com.strings.in;

public class LongestCommonPrefix {
   public static void main(String[] args) {
	String str[]= {"Flower","Flow","Flock","Floor"};
	String pre="";
	String shortest=str[0];
	for(int i=0;i<str.length;i++) {
		if(shortest.length()>str[i].length()) {
			shortest=str[i];
		}
	}
	for(int i=0;i<shortest.length();i++) {
		int count=0;
		for(int j=0;j<str.length;j++) {
			if(shortest.charAt(i)==str[j].charAt(i)) {
				count++;
			}
		}
		if(count==str.length) {
			pre+=shortest.charAt(i);
		}
	}
	
	System.out.println(pre);
}
}
