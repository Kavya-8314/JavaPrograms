package com.strings.in;

public class LongestCommonSuffix3 {
  public static void main(String[] args) {
	String s[]= {"Running","Eating","Walking","Sleeping","Roaming"};
	//STEP-1:Reverse the String
	for(int i=0;i<s.length;i++) {
		s[i] = new StringBuilder(s[i]).reverse().toString();
	}
	//STEP-2:Find the Prefix
	String prefix=s[0];
	for (int i = 0; i < s.length; i++) {
		while(!s[i].startsWith(prefix)) {
			prefix=prefix.substring(0, prefix.length()-1);
			if(prefix.isEmpty()) {
				System.out.println("");
				return;
			}
		}
	}
	//STEP-3: Reverse the prefix
	String suffix=new StringBuilder(prefix).reverse().toString();
	System.out.println(suffix);
	
}
}
