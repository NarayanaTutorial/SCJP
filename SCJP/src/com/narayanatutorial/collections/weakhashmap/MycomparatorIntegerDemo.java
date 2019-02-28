package com.narayanatutorial.collections.weakhashmap;

import java.util.Comparator;

public class MycomparatorIntegerDemo implements Comparator<Object> {

	@Override
	public int compare(Object Obj1, Object Obj2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) Obj1;
		Integer I2 = (Integer) Obj2;

		 return I1.compareTo(I2); //[0,5,10,15,20]
		// return I2.compareTo(I1); //[20,15,10,5,0]
	    //return O ; // insert element present & all the remaining elements treated duplicates[20]
	}
}

