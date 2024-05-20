package com.java.thread;

public class Consumer extends Thread{
	Company c;
	public Consumer(Company c){
		this.c = c;
	}
	public void run() {
		while(true) {
			this.c.consume_item();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
