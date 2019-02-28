package com.narayanatutorial.collections.weakhashmap;

import java.util.Comparator;

public class MyComparatorHeterogeneous implements Comparator {

	@Override
	public int compare(Object Obj1, Object Obj2) {
		// TODO Auto-generated method stub
		String s1 = Obj1.toString();
		String s2 = Obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 < l2)
			return -1;
		else if (l1 > l2)
			return +1;
		else
			return s1.compareTo(s2);
	}

}
