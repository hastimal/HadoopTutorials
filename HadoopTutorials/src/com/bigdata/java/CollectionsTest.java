package com.test.pkg;

import java.util.*;
public class CollectionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(50);
		
		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(100);
		l2.add(200);
		l2.add(500);		
		
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		if (l2.contains(500))
		{
			System.out.println("Yes , 500 is present");
			Iterator it = l2.iterator();
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
			l2.remove(2);
			for(Integer i: l2)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Usage of Sets");
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(30);
		s1.add(70);
		s1.add(20);
		s1.add(50);
		
		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(700);
		s2.add(300);
		s2.add(400);
		s2.add(100);
		
		System.out.println("Hash Set elements are");
		
		for(Integer i: s1)
			System.out.println(i);
		
		System.out.println("Tree Set elements are");
		
		for(Integer i: s2)
			System.out.println(i);
	}

}
