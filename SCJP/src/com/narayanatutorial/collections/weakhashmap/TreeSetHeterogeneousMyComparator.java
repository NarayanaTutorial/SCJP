package com.narayanatutorial.collections.weakhashmap;

import java.util.TreeSet;

public class TreeSetHeterogeneousMyComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeSet t = new TreeSet (new MyComparatorHeterogeneous());
		         t.add("A");
		         t.add(new StringBuffer("ABC"));
		         t.add(new StringBuffer("AA"));   
		         t.add("XX");
		         t.add("ABCD");
		         t.add("A");
		        System.out.println(t);
	}

}
