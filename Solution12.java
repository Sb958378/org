package org;

import java.util.TreeSet;

public class Solution12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Employee e1 = new Employee(111);
	  Employee e2 = new Employee(222);
	  Employee e3 = new Employee(333);
	  
	  TreeSet <Employee> ts = new TreeSet<Employee>();
	  
	  ts.add(e1);
	  ts.add(e2);
	  ts.add(e3);
	  
	  for(Employee emp : ts) {
		  System.out.println(emp);
	  }
	}

}
