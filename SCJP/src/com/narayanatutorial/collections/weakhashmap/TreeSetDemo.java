package com.narayanatutorial.collections.weakhashmap;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("B");
		t.add("Z");
		t.add("L");
		// t.add(new Integer(10)); // Class Casting Exception
		// t.add(null); // Null Pointer Exception
		System.out.println("TreeSet:"+t);
	}
}
