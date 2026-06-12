package com.functionalinterface.in;

import java.util.function.Predicate;
//Predicate
public class Main {
	
 public static void main(String[] args) {
	Predicate<Integer> p=new Predicate<Integer>() {
		public boolean test(Integer num) {
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
	System.out.println(p.test(67));
}
}
