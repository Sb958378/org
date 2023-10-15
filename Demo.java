package org;

import java.util.Iterator;
import java.util.Vector;

public class Demo {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(10);
		v.add(1.5);
		v.add(30);
		v.add("java");
		
		for(Object obj: v) {
			System.out.println(obj);
		}
		
		Iterator i = v.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
