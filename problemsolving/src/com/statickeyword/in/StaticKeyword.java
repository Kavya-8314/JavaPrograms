package com.statickeyword.in;
//For static variables if we don't assign the values then,
//the JVM gives the default values.
//***But for final static variables ,the developer should assign the value.
public class StaticKeyword {
	static int a;
    public static void main(String[] args) {
    	StaticKeyword sk=new StaticKeyword ();
    	  System.out.println(sk.a);
	}
}
