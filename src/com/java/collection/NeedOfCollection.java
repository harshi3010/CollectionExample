package com.java.collection;

import java.util.Scanner;

public class NeedOfCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
//		a[0] = 0;
//		System.out.println(a[0]);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();
		
		//Taking input from array
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		
		//Printing Array
		for(int i=1;i<=n;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
