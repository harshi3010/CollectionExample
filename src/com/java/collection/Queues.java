package com.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queues{
		
	public static void main(String[] args) {
		
		//Queue extends the collection interface
		/*
		 * add(E element) - throws exception if queue is full
		 * boolean offer(E element ) does not throw exception just offer to add element
		 * poll() - removing element to remove
		 * remove() - 
		 * peek() - return element at the peek(current) of interface 
		 * element() - 
		 * 
		 */
		//LinkedList,ArrayList,Deque- allows double-ended queues ,element can be inserted or remove either a side,FIFO queue,item added at the tail are presented at the head for inspection or removal int the same order 

		//Queue is a interface we need concrete implementation of both
		//BEHAVES AS STACK
		Queue<Integer> q = new LinkedList<>();  //when you want to use normal queue - use LinkedList and when FIFO order you want (Stack) use ArrayDeque
		q.offer(1);
		q.offer(2);
		
		//Operations on  -- showing LIFO order
		System.out.println("Printing the queue:" + q);
		System.out.println("Element at peek : " + q.peek()); //printing element which is at top
		System.out.println("Element to pool : " + q.poll()); //polling element which is at top  
		System.out.println("Element at peek : " + q.peek()); 
		System.out.println(q.isEmpty());  //queue implement collection so all the method of collection comes to queue
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		while(!stack.isEmpty()) {  //jabtk stack khali na ho peek /pop
			System.out.println("Element last in : " + stack.peek());
			System.out.println("Removing element : "+ stack.pop());
			
		}
		
		System.out.println("Implementing Queue Features.....");
		//ArrayDeque
		
		/*
		 * u can use deque as a stack - just used above dq.offerFirst()
		 * if you want to behave them as a normal queue - first insert it at last offerLast 
		 * offerLast (Last In)--- pollfirst(First out ) -- act or behave as stack
		 * offerfirst(first in) --- pollfirst(first out) -- act or behave a queue.
		 * 
		 */
		Deque<Integer> dq = new ArrayDeque<>();
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		
		System.out.println("Pull first: " + dq.pollFirst());
		System.out.println("Pull Last: " + dq.pollLast());
		
	}
	
}