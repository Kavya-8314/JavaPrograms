package com.strings.in;

public class BananaDuplicate1 {
 public static void main(String[] args) {
	String s="Banana";
	for (int i = 0; i < s.length(); i++) {
		boolean found=false;
		for (int j = 0; j < i; j++) {
			if(s.charAt(i)==s.charAt(j)) {
				found=true;
				break;
			}
		}
		if(!found) System.out.print(s.charAt(i));

	}
}
}
