package com.narayanatutorial.collections.weakhashmap;

import java.util.Comparator;

public class MycomparatorInteger implements Comparator<Object> {

	@Override
	public int compare(Object Obj1, Object Obj2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) Obj1;
		Integer I2 = (Integer) Obj2;
		if (I1 < I2) {
			return +100;
		}
		else if (I1 > I2) {
			return -1;
		} else
			return 0;
	}
}
