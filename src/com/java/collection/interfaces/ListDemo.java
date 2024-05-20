package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> list = new ArrayList<>();
//			
//			//List allows you to add duplicate elements
//			list.add("element1");
//			list.add("element1");
//			//List allows to add null element to add in list
//			list.add(null);
//			list.add(null);
//			list.add("element2");
//			list.add("element2");
//			System.out.println(list);
			
			//List maintain the insertion order
			list.add("element1");
			list.add("element2");
			list.add("element4");
			list.add("element3");
			list.add("element5");
			
			System.out.println(list);
			//List access elements from List
			System.out.println(list.get(0));
			System.out.println(list.get(4));
			
			list.add(2, null);
			System.out.println(list);
			List<String> list2 = new ArrayList<>();
			list2.add("Kriyansh");
			list2.add("Hansh");
			list2.add("Dev");
			list.addAll(list2);
			System.out.println(list2);
			System.out.println(list);
	
			
	
	}
	

}
