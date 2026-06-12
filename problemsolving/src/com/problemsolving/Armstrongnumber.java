package com.problemsolving;

import java.util.Scanner;

public class Armstrongnumber {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int i=sc.nextInt();
	System.out.println(i);
	int count=0;
	while(i>0) {
	int digit=i%10;
	count++;
	i=i/10;
	
	}
	System.out.println("count is:"+count);
}
}
