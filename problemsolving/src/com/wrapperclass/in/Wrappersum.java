package com.wrapperclass.in;

public class Wrappersum {
  public static void main(String [] args) {
	String s="1234";
	int i=Integer.parseInt(s);
	int sum=0;
	while(i>0) {
		int digit=i%10;
		sum+=digit;
		i=i/10;
	}
	System.out.println(sum);
}
}
