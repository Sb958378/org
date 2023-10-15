package org;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreStudent {

	public static void main(String[] args) {
	Student s = new Student(20);
	Student s1 = new Student(22);
	Student s2 = new Student(25);
	
	
	ArrayList<Student> l = new ArrayList<Student>();
	
	l.add(s);
	l.add(s2);
	l.add(s1);
	
	
	for(int i = 0 ; i<l.size(); i++) {
		System.out.println(l.get(i));
	
	}
	System.out.println( "-------------------");
		Iterator<Student> S = l.iterator();
		while(S.hasNext())
		{
			System.out.println(S.next());
			
		}
		
	

	}

}
