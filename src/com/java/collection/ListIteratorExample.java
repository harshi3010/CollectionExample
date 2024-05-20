package com.java.collection;

import java.util.*;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List interface contains list iterators - so,apart from hasnext(),next() what
		// other methods are available here...

		List<Integer> alist = new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(3);

//		Integer[] arr = alist.toArray(new Integer[0]);
//		for (int x : arr) {
//			System.out.print(x + ",");
//		}
		/*
		 * interface ListIterator<E> extends Iterator<E>{ boolean hasNext(); boolean
		 * hasPrevious(); E next(); //Element after the cursor E previous(); //Element
		 * before the cursor
		 * 
		 * Provides two methods -- ListIterator<E> listIterator() ListIterator<E>
		 * listIterator(int index) --bidirectional iterator for lists. extends the
		 * iterator interface and allows the list to traversed in either direction using
		 * the next() and prev(). mostly used for LinkedList (u might require for these
		 * list iterator)
		 */
//		List<Integer> lk = new LinkedList<>();
//		lk.add(1);
//		lk.add(2);
//		lk.add(3);
//		lk.add(4);
//		lk.add(5);
//		lk.add(6);
//		
//		ListIterator<Integer> iterator = lk.listIterator();
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.previous());  //print prev from cursor
//		System.out.println();
//		
//		

		/*
		 * next() === item[index++] --first it will go to the value and then index is
		 * shifted to next prev() === item[++index] --first it will return the value and
		 * then it will go to prev
		 */
		// FIFO queue Ordering -we use linkedlist to implement queue
		// use Linkedlist class

//		Queue<Integer> queue = new LinkedList<>();
//		queue.offer(1);
//		queue.offer(2);
//		queue.offer(3);
//		
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.peek());
//		
//		System.out.println(queue.isEmpty());
//	

		// stack - Stack class LIFO
//		Stack<Integer> s = new Stack<>();
//		s.push(1);
//		s.push(2);
//		while(!s.isEmpty()) {
//			System.out.println("Poping element which is last added");
//			System.out.println(s.peek());
//			System.out.println(s.pop());
//		
//		}
//		
		// If you wanted to implement double ended queue -use arraydeque and also used
		// to implement stack as well -but we don't usually do
		// 0 1 BFS
//		Deque<Integer> dq = new ArrayDeque<>();
//		dq.offerFirst(1);
//		dq.offerFirst(2);
//		System.out.print(dq);
//		dq.offerLast(3);
//		//dq.pollFirst();
//		System.out.println(dq.peekFirst());
//		System.out.print(dq);
//		

		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());//6 times comparator methods called
		pq.offer(1);
		pq.offer(0);
		pq.offer(100);
		pq.offer(23);
		pq.offer(34);

		
		//6 times comparator methods called
		// top 2 elements   
		List<Integer> top2 = new ArrayList<>();
		int index = 0;
		while (!pq.isEmpty()) {
			if (index == 2) {
				break;
			}
			top2.add(pq.poll());
			index++;
		}

		System.out.println(top2);        //100 34
		System.out.println(pq);			 //23 0 1             
// when we r using custom class , we have to use a comparator   ---own compareto function
		List<StudentMarks> stMarks = new ArrayList<>();
		stMarks.add(new StudentMarks(70, 80));
		stMarks.add(new StudentMarks(38, 10));
		stMarks.add(new StudentMarks(67, 90));
		stMarks.add(new StudentMarks(40, 88));
		stMarks.add(new StudentMarks(97, 19));

		PriorityQueue<StudentMarks> spq = new PriorityQueue<>(stMarks);        //here only comparable interface implemented methods executes and checked whether maths marks is greater top 3 stored like that
		//6 times call compareTo method here
		//97 70  67
		
		// top 3 elements
		//6 times call compareTo method here
		List<StudentMarks> top3 = new ArrayList<>();
		index = 0;
		while (!spq.isEmpty()) {
			if (index == 3) {
				break;
			}
			top3.add(spq.poll());
			index++;
		}

		System.out.println(top3);
		// What if we want top2 elements of bottom2 ?
		
	}

}
