package org;

public class Employee implements Comparable <Employee>{
	
	int id;
	
	Employee(int id){
		this.id = id;
		
	}
	
	public String toString() {
		
		return "id"+ id;
	}

	

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.id - e.id;    // descending e.id -this.id;S
	}
}
