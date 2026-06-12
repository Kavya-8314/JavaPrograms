package com.polymorphism.in;
public class MethodOverloading {
    public static void main(String[] args) {
		int a=10;
		int b=20;
		add(a,b);
	}
    public static void add(byte a,byte b) {
    	System.out.println("Byte values");
    }
    public static void add(int a,int b) {
    	System.out.println("Integer values");
    }
    public static void add(long a,long b) {
    	System.out.println("Long values");
    }
    public static void add(float a,float b) {
    	System.out.println("Float values");
    }
    public static void add(double a,double b) {
    	System.out.println("Double values");
    }
    public static void add(Integer a,Integer b) {
    	System.out.println("Wrapper Integer values");
    }
    public static void add(int...k) {
    	System.out.println("Var args");
    }
}
