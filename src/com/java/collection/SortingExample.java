package com.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
//class Student implements Comparable<Student>{  //if you don't want to use these use comparator
	
	int age;
	String name;
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	public int compareTo(Student that) {
		if(this.age > that.age)
			//swap
			return 1;
		else
				return -1;

	}
	
}

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Comparator<Integer>  com = new Comparator<Integer>() {
			
			//put the logic how you want to sort it..
			
			public int compare(Integer i,Integer j) {
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
		};
		
		//Sort through Age
		Comparator<Student> com1 = (i,j) ->	i.age > j.age ? 1:-1;       //wrote through lambda expression
//				Comparator<Student> com1 = new Comparator<Student>() {  //use when you don't want to implements comparable<class>
//					public int compare(Student i,Student j) {
//						if(i.age > j.age)
//							//swap
//							return 1;
//						else
//								return -1;
//						}
//				};
		
		List<Student> student = new ArrayList<>();
		student.add(new Student(21,"Harshi"));
		student.add(new Student(12,"Jash"));
		student.add(new Student(18,"Kangana"));
		student.add(new Student(20,"Ritesh"));
		
//		Collections.sort(student); //use when you implements comparable interface need to use compareTo method
		Collections.sort(student,com1);
		for(Student s : student)
		{
			System.out.println(s);
		}
		
		List<Integer> nums = new ArrayList<>();
		nums.add(43);
		nums.add(31);
		nums.add(72);
		nums.add(29);
		
		//Collections.sort(nums,com);    //use for comparator
		System.out.println(student);
		for(Student s:student) {
			System.out.println(s);
		}
			
	}

}
