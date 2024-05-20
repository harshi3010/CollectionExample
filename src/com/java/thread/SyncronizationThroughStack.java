package com.java.thread;

public class SyncronizationThroughStack {

	private int[] array;
	private int stackTop;
	
	public SyncronizationThroughStack(int capacity) {
		array = new int[capacity];
		stackTop = -1;
	}
	
	public boolean push(int element) {
		if(isFull())
			return false;
			++stackTop;	
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			array[stackTop]=element;
			return true;
		
		}

	public int pop() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		int obj = array[stackTop];
		array[stackTop] = Integer.MIN_VALUE;
		
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		stackTop--;
		return obj;
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stackTop < 0;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return stackTop >= array.length - 1;
	}
	
}
