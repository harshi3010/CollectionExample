package com.java.thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company company = new Company();
		Producer producer = new Producer(company);
		Consumer consumer = new Consumer(company);
		
		
		
		producer.start();
		consumer.start();
		
		
	}

}
