package com.functionalinterface.in;

import java.util.function.Predicate;
import java.util.function.Consumer;
public class Example1 {
	public static boolean isPrime(int num) {
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
 public static void main(String[] args) {
	Predicate<Integer> p=num-> {
			System.out.println((isPrime(num))?"Prime":"!Prime");
			return true;
		
	};
	p.test(17);
	Consumer<Integer> c=(Integer num)-> {
			System.out.println((isPrime(num))?"Prime":"!Prime");
		
	};
	c.accept(1);
}
}
