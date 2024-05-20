package com.java.thread;

public class Company {

	int n;
	boolean f = false;
	
	//f-false : chance : producer
	//f-true : chance : consumer
	
	synchronized public void product_item(int n) {
		if(f) { //jaise hi f ki value false nhi hojati if k bahar ka loop execute nhi karega
		//if f ki value true hai toh consumer ka chance hai tph producer wait krega jaise hi f mil gaya produced krke f = true krdega then niche ka run hoga --- 
			//Thread Communication 
			try 
			{
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		f=true;
		notify();
		this.n = n;
		System.out.println("Produced :"+this.n);
		
	}
	synchronized public int consume_item() {
		if(!f) {//jaise hi f ki value true nhi hojati if k bahar ka loop execute nhi karega
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed.. " + this.n);
		f = false;
		notify();
		return this.n;
	}
	
}
