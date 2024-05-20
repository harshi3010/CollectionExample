package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		System.out.println(fruits);
	}
	
	//1.Increase and decrease it's size when required - resizable..
	//also called dynamic array -- it grows it size to accommodate new elements and shrinks the size when the elements are removed
	
	//allow duplicate and null value
	
	//allow maintain a ordered collection - maintain insertion order of element 
	
	//internally uses arrays to store the elements.like arrays -it allows you to retrieve the element by their index
	
	//You cannot create arraylist of primitive type like int,char, etc. You need to use boxed types like Integer,Character,Boolean(Wrapper classes with Arraylist)
	//generic class doesn't support primitives

	//Java ArrayList is not synchronized.if multiple threads try to modify an arraylist at the same time, then final outcome will not be deterministic. You must explicitly synchronize access to an arrayList if multiple threads are gonna modify it
	//CollectionUtilies- Class, 
	
	
	
	
	
}
