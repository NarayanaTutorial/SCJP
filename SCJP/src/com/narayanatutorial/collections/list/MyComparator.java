package com.narayanatutorial.collections.list;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	public int compare(Object Obj1, Object Obj2)
    {
     String s1 = (String)Obj1;
     String s2 = (String)Obj2;
      return s1.compareTo(s2);
    }

}
