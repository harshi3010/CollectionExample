package com.java.collection.interfaces;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> students = new Hashtable<>();
		students.put("Navin",56);
		students.put("Harsh",57);
		students.put("Kapil",58);
		students.put("Bhavin",59);
		
		
		
		System.out.println(students);
		System.out.println(students.get("Harsh"));
		students.put("Harsh", 90);
		System.out.println(students);
		
		for(String name :students.keySet()){
			System.out.println(name + " : " + students.get(name));
		}	
	}
}
