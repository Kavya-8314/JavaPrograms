package com.arraylist.in;

import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
//	System.out.println(list);
	list.add(10);
	list.add(20);
	list.add(30);
//	System.out.println(list);
	
//	list.remove(1);
//	System.out.println(list);
//	list.set(1, 200);
//	System.out.println(list);
//	System.out.println(list.size());
//	System.out.println(list.contains(100));
//	System.out.println(list.get(1));
	System.out.println("--------------------------------");
//	for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
//	}
	for(Integer num:list) {
		System.out.println(num);
	}
}
}
