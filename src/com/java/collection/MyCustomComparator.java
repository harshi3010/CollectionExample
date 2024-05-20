package com.java.collection;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		System.out.println("Comparator method called");
		return o2 - o1;
	}
		
}
