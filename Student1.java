package org;

public class Student1 implements Comparable <Student1> {

	     String name;
	     
	     Student1(String name){
	    	 this .name = name;
	    	 
	     }
	     
	     
	     public String toString() {
	    	 return "name "+ name;
	     }
	     
	     


		@Override
		public int compareTo(Student1 o) {
			// TODO Auto-generated method stub
			return this.name.compareTo(o.name);
		}
}
