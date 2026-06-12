package com.functionalinterface.in;

interface NumberChecker{
	public boolean checkNumber(int num);
}
interface CharChecker{
	public void checkChar(char ch);
}
public class MainClass {
	
	public static boolean isPrime(int number) {
		if(number<2) {
			return false;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	NumberChecker n=new NumberChecker() {
		@Override
		public boolean checkNumber(int num) {
			if(num<2) {
				return false;
			}
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
	};
	 System.out.println(n.checkNumber(17));
	 CharChecker c=new CharChecker() {
		 @Override
		 public void checkChar(char ch) {
			int ascii=(int) ch;
			boolean isPrime=true;
			if(ascii<2) {
				isPrime=false;
			}
			for(int i=2;i<ascii;i++) {
				if(ascii%i==0) {
					isPrime=false;
					break;
				}
			}
			System.out.println((isPrime)?"Prime Number":"Not a prime number");
		 }
	 };
	    c.checkChar('a');
	   System.out.println(isPrime(7));
	}
}
