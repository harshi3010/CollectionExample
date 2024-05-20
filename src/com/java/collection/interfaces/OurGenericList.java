package com.java.collection.interfaces;

import java.util.Iterator;


//collection interface implements iterable so every interface who extend iterable need to used iterable interface as a implentation/definition in their code
public class OurGenericList<T> implements Iterable<T>{
	private T[] items;
	private int size;
	
	//Constructor of OurGenericList class - which is outer class/base class - ,below implemented the inner class.
	public OurGenericList() {
		size = 0;
		items = (T[])new Object[100];

	}

	
	//add item to List of T - type
	public void add(T item) {
		items[size ++] = item;
	}
	
	//return item at index
	public T getItemAtIndex(int index) {
		return items[index];
	}

	@Override                  //return collection for loops to clients
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		
		//called private methods which is implemented below to hide the actual implementation of iterator interface to client 
		return new OurGenericListIterator(this);
	}
	
	
	//To hide main implementation code of iterator -- to client
	//class which is created into OurGeneric class as a inner class to hide the implementation of Iterator to clients
	private class OurGenericListIterator implements Iterator<T>{
		
		private OurGenericList<T> list;
		private int index = 0;
		
		//Constructor -- inner class constructor
		public OurGenericListIterator(OurGenericList<T> list) {
			this.list = list;
		}
		
		
		//two unimplemented methods on iterator interface which needs to be implemented once we implement this interface in our class
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			System.out.println("HAS NEXT CALLED..");
			return index < list.size;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
//			int item = list.items[index];
//			index ++;
//			return item;
			System.out.println("next called..");
			return list.items[index ++];
		}	
	}
}
