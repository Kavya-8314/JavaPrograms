package com.strings.in;

public class CountingVowelsConsonants {
  public static void main(String[] args) {
	String str="abcdefghABCDEFGH";
	str=str.toLowerCase();
	int vowels=0;
	int consonants=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
				System.out.println(ch+" is a vowel");
				
			}else {
				consonants++;
				System.out.println(ch+" is a consonant");
				
			}
		}
	}
	System.out.println(vowels+" vowels");
    System.out.println(consonants+" consonants");
   
}
}
