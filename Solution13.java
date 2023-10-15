package org;

import java.util.TreeSet;

public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student1 s1 =new Student1("aman");
		Student1 s2 =new Student1("yash");
		Student1 s3 =new Student1("chandan");
		
		TreeSet<Student1> ts = new TreeSet<Student1>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		for(Student1 s : ts ) {
			System.out.println(s);
		}
	}

}
