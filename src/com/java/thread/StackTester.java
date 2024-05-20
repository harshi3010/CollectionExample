package com.java.thread;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		SyncronizationThroughStack s1  = new SyncronizationThroughStack(5); 
		
		System.out.println(s1);
		
		System.out.println("main is starting....");
		
		new Thread(() -> {
			int counter = 0;
			while(++ counter < 10)
				System.out.println("Pushed: " + s1.push(100));
		},"Pusher").start();
		
		
		new Thread(() -> {
			int counter = 0;
			while(++counter < 10)
				System.out.println("Popped: " + s1.pop());
		}
		,"Poper").start();
		
		
		System.out.println("main is exiting...");
	}
	

}
