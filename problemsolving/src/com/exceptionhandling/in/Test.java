package com.exceptionhandling.in;

class InvalidNumberException extends Exception{
	public InvalidNumberException(String message) {
		super(message);
	}
}
class Handling {
	public static void tiMethod(int num){
		try {
			System.out.println("10000");
			tilMethod(num);
			System.out.println("Coders");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
public static void tilMethod(int num) throws InvalidNumberException,Exception{
	try {
		int result=10/num;
		System.out.println("Completed");
		if(num==0) {
			throw new InvalidNumberException("Number should not be zero");
		}else if(num==10) {
			throw new Exception("Number should not be 10");
		}
	}
	catch(Exception e) {
		System.out.println("ArithmeticException:"+e.getMessage());
	}
	finally {
		System.out.println("Finally");
	}
}
}
	
public class Test {
 public static void main(String[] args) {
	Handling.tiMethod(15);
}
}
