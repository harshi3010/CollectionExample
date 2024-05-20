package com.java.collection.interfaces;

import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurGenericList<Integer> list = new OurGenericList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
//			Iterator<Integer> iterator = list.iterator();
//			while(iterator.hasNext())
//				System.out.println(iterator.next());
			
			//ABOVE CODE DO SAME THING AS BELOW CODE, FOR EASY WAY COLLECTION FRAMEWORK PRINT ELEMENT THROUGH FOREACH LOOP
		//we don't need to implement explicity this hasnext and next methods ,but if we do /implement this Iterator do it privately and provide implementation of hasnext and next method separately
		
			for(int x:list)
				System.out.println(x);
	
	}
}
