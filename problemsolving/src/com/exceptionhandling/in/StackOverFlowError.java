package com.exceptionhandling.in;

public class StackOverFlowError {
	public static void fun1() {
		fun2();
	}
    public static void fun2() {
		fun1();
	}
   public static void main(String[] args) {
	   StackOverFlowError.fun1();
}
}
