package com.java.collection;

import java.util.Comparator;

public class StudentMarks implements Comparable<StudentMarks>{

	private int maths;
	private int physics;
	
	@Override
	public String toString() {
		return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
	}

	public int getMaths() {
		return maths;
	}

	public int getPhysics() {
		return physics;
	}

	public StudentMarks(int maths, int physics) {
		super();
		this.maths = maths;
		this.physics = physics;
	}


	@Override
	public int compareTo(StudentMarks o) {
		// TODO Auto-generated method stub
		
		/*
		 currentObject < other object
		 	return -1
		 currentObject > other object
		 	return 1
		 currentObject == other object
		 	return 0
		 	 
		 */
		
//		if(o.maths < this.maths) 
//			return -1;
//		if(o.maths > this.maths)
//			return 1;
//		if(o.maths == this.maths)
//			return 0;
		System.out.println("Compare to () is called");
		return o.maths - this.maths;
	}
	
	
}
