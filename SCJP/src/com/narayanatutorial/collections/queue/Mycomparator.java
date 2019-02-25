package com.narayanatutorial.collections.queue;

import java.util.Comparator;

public class Mycomparator implements Comparator<Object> {

	
	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s2.compareTo(s1);

	}

}
