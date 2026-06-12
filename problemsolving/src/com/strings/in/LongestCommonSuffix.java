package com.strings.in;

public class LongestCommonSuffix {
	public static void main(String[] args) {
		String str[]= {"Running","Walking","Eating","Sleeping"};
		String suf="";
		String shortest =str[0];
		for(int i=0;i<str.length;i++) {
			if(shortest.length()>str[i].length()) shortest=str[i];
		}
		for(int i=0;i<shortest.length();i++) {
			int count=0;
			for(int j=0;j<str.length;j++) {
				if(shortest.charAt(shortest.length()-1-i)==str[j].charAt(str[j].length()-1-i)) count++;
			}
			if(count==str.length) suf+=shortest.charAt(shortest.length()-1-i);
			else break;
		}
		String res="";
		for(int i=suf.length()-1;i>=0;i--) {
			res+=suf.charAt(i);
		}
		System.out.println(res);
		
	}
			
}
