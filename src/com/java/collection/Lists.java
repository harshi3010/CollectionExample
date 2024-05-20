package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. maintains order and contains duplicates
		//2.element in a list are ordered
		//3. each element are position based , starting from 0
		
		//ArrayList,LinkedList,Vector
		
		//ArrayList - dynamic list- when we don't know the size of array.don't know the size, internally implement array with default
		/*
		 * Internally it uses a Normal array - default capacity size - -by default - 10
		 * when that capacity is reached , it will create anew array of bigger size (50% of its current capacity) and copies all the element from all array to new array
		 * new array reference for its internal usage
		 * 100 --150 --old array is no more in used and hence became garbage collected in the next garbage collection.
		 * basically implements list interface
		 */
		
		//Vector 
		/*
		 * Vector class is a legacy class which implements the list interface
		 * vector and ArrayList classes are implemented using dynamically
		 * resizable arrays, providing fast random access(i.e, position based access) and fast 
		 * List traversal - very much like using an ordinary array.
		 * Unlike arrayList class vector is a thread safe, concurrent calls to vector will not compromise its integrity
		 * Both ArrayList and vector classes offer comparable performance ,but vector suffers a slight performance penalty due to synchronization
		 * 
		 */
		
		//LinkedList -- 
		/*
		 * uses a doubly linked -list
		 * insertion and deletions in a doubly-linked list are very efficient
		 * 
		 */
		
		//Difference ArrayList and LinkedList
		/*
		 * position-based access has constant-time performance for the ArrayList and vector class | traverse in a doubly linked list
		 * when frequent insertion and deletion occurs inside a list, a linkedList can be worth considering
		 * Overall the arrayList implementation is the best choice for implementing lists.
		 * in addition to the List Interface, the linkedList class also implements Deque interface that allow it to be used for stacks and different kinds of queues.
		 */
		
		
		//Generic only allow reference type to be added List/ArrayList/Vector<T> - T must be a reference type..internally it is calling a object class of element which is passed
		//List<int> -- not allowed - it is not reference type /it is primitive datatype we need Wrapper class those has particular type class defined..
		//Wrapper class - Integer,Float,Boolean, Double, Character
		List<Integer> alist = new ArrayList<>();
		alist.add(5);
		alist.add(6);
		alist.add(8);
		alist.add(7);
		alist.add(8);
		System.out.println(alist);
		System.out.println("element that got replaced = " + alist.set(2, 100));
		System.out.println(alist);
		
		
		//Wanted to convert arrayList to only Array 
		
		
		//2. Creating a copy of existing Arraylist into new ArrayList
		List<Integer> a_newList = new ArrayList<>();
		Integer arr[] = alist.toArray(new Integer[0]);
		// 
		//new Integer[0] - talking about the size of new Array if u put size < then existing array list it will create a new array of current size arraylist
		
		System.out.println("Printing conversion of ArrayList to List -- " + arr);
		for(int x:arr) {
			System.out.println("Traversing the converted Array....");
			System.out.println(x);
		}
		
		a_newList.add(11);
		a_newList.add(12);
		a_newList.add(13);
	
		a_newList.addAll(alist);
		System.out.println(a_newList);
		//second approach
		List<Integer> alist2 = new ArrayList<>(alist);
		alist2.add(7);
		System.out.println(alist2);
		System.out.println("Index of element 7 present at " + alist2.indexOf(7));
		
		//ideally it takes index of methods - alist2.indexOf(new Integer(2)); --- this would be taken care by compiler internally..
		System.out.println("Last Index of element 8 " + alist2.lastIndexOf(8));
		
		//Their is a concept of unboxing is their where your Integer class - and int takes internal representation of taking integer..
		for(int x:alist) {
			//System.out.println("Adding element..");
			System.out.println(x + " , ");
		}
		
	
		List<Integer> alist3 = alist2.subList(1, 4); //4th is optional 
		alist3.set(0, 111);  //if you change the content of subList it will change the original list a well.and before change it will give a view of it.
		System.out.println(alist3);
		System.out.println(alist2);  //got changed in main list as well..
	}
	
	
}
