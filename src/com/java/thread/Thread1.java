package com.java.thread;

public class Thread1 extends Thread{
	
	public Thread1(String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
	}

	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("inside " + Thread.currentThread() + i);
		}
	}
}
