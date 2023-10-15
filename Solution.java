package org;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		
		
		LinkedList ll = new LinkedList();
		ll.add(al);
		ll.add(30);
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println("--------");
		System.out.println(ll.containsAll(al));
		System.out.println("---------");
		System.out.println(ll);
		ll.removeAll(al);
		System.out.println(ll);

	}

}
