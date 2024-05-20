package com.java.thread;

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main is starting..");
		Thread thread1 = new Thread1("thread1");
		thread1.start();
		Thread thread2 = new Thread(new Thread2(),"thread2");
		thread2.start();
		
		System.out.println("Main is exiting..");
		
		
		
	}
	

}
