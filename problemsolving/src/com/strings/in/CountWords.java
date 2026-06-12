package com.strings.in;

import java.util.Arrays;

public class CountWords {
   public static void main(String[] args) {
	String s="Java is Vast";
	String arr[]=s.split(" ");
	int count=0;
	for(String words:arr) {
		count++;
	}
	System.out.println(count);
	
}
}
