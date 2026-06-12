package com.functionalinterface.in;
//Consumer
import java.util.function.Consumer;

public class Main1 {
	public static void main(String[] args) {
		
	
Consumer<Character> c=new Consumer<Character>() {
	public void accept(Character ch) {
		int ascii=(int)ch;
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
		System.out.println((isPrime)?"Prime Number":"Not a Prime Number");
	}
 };
  c.accept('C');
 }
}
