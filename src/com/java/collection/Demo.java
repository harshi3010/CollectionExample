package com.java.collection;
import java.util.Scanner;

public class Demo {

	public static void main(String args[]) {
	//System.out.println("Hello World");
	Scanner sc = new Scanner(System.in);
	var num = new int[3];
	
	System.out.println("Enter element to insert in array:");
	for(int i=1;i<=num.length;i++) {
		num[i] = sc.nextInt();
		return;
	}
	
	System.out.println("Printing Array");
	for(int i=1;i<=num.length;i++) {
		System.out.println(num[i]);
	}
	}

}
