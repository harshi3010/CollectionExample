package com.java.thread;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(" Second Thread " +Thread.currentThread() + i);
		}	
	}
}
