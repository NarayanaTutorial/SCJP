package com.narayanatutorial.collections.weakhashmap;

import java.util.TreeSet;

public class TreeSetDemoReverseSortingOrderString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet t = new TreeSet (new MyComparatorString()); 
       t.add("A");
       t.add("Z");
       t.add("K");
       t.add("B");
       System.out.println(t);
	}
}
