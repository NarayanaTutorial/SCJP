package com.narayanatutorial.collections.weakhashmap;

import java.util.TreeSet;

public class TreeSetStringBufferAlphaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet (new MyComparatorStringBufferToString());
        t.add(new StringBuffer("A")); 
         t.add(new StringBuffer("B")); 
         t.add(new StringBuffer("Z"));
         t.add(new StringBuffer("L")); 
         System.out.println(t); 
	}

}
