package com.wrapperclass.in;

public class Wrapperphoneno {
    public static void main(String [] args) {
		String s="9949822790";
		long x=Long.parseLong(s);
//		System.out.println(s);
		int count=0;
		for(long i=x;i>0;i=i/10) {
			count++;
		}
		if(count==10) {
			System.out.println("Valid phonenumber");
		}else {
			System.out.println("Invalid number");
		}
		
	}
}
