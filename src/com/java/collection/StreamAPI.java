package com.java.collection;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> nums = Arrays.asList(4,5,6,7,2,3);
			int sum = 0;
			for(int n: nums) {
				if(n%2==0) {
					n = n*2;
					sum = sum + n;
				}
			}
			System.out.println(sum);
			
	}

}
