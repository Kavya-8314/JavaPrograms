package com.functionalinterface.in;
 
interface NumberChecker1{
	public boolean checkNumber(int num);
}
public class Main3 {
 public static void main(String[] args) {
	 NumberChecker1 n= num-> {
			if(num<2) {
				return false;
			}
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
					
				}
			}
			return true;
		
		 
	 };
	 System.out.println(n.checkNumber(17));
}
}
