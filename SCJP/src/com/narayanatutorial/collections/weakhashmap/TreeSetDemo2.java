package com.narayanatutorial.collections.weakhashmap;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new Integer(10));
		System.out.println(t);
	}
}
