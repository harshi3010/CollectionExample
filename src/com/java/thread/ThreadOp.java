package com.java.thread;

class UserThread extends Thread{
	public void run() {
		//task for thread...
		System.out.println("This is user defined task");
	}
}

public class ThreadOp{
	public static void main(String[] args) {
		
		System.out.println("Program Started..");
		//Thread
		Thread t = Thread.currentThread(); //currentThead() - it is static that's why it is called with class Thread.currentThread() which returns Thread object.	
		System.out.println(t);
		String tname = t.getName();
		System.out.println("Current Running thread is:"+ tname);
		t.setName("Mymain");
		System.out.println(t.getName());
		int x = 56 + 34;
		System.out.println("The sum is " + x);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t.getId());	
		System.out.println("Program Ended");
		System.out.println("Going to start user defined thread..");
		UserThread thread = new  UserThread();
		thread.start();
		
	}
}
