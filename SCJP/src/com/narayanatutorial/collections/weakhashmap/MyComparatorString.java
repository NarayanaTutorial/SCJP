package com.narayanatutorial.collections.weakhashmap;

import java.util.Comparator;

public class MyComparatorString implements Comparator{

	@Override
	public int compare(Object Obj1, Object Obj2) {
		// TODO Auto-generated method stub
		String s1 = Obj1.toString();
	    String s2 = (String)Obj2;
	    return s2.compareTo(s1);
	}
  
}
