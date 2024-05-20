package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("banana");
		fruitCollection.add("kiwi");
		fruitCollection.add("apple");
		fruitCollection.add("Orange");
		
		System.out.println(fruitCollection);
		System.out.println(fruitCollection.contains("apple"));
		fruitCollection.remove("Orange");
		System.out.println(fruitCollection);
	
		
		//Printing every element in String collection	
		fruitCollection.forEach(element ->
		System.out.println(element)
		);
		
	}

}
