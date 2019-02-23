package com.narayanatutorial.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
	public static void main (String[] args) 
    {
          ArrayList<String> al= new ArrayList<String>(); 
          al.add("Z"); 
          al.add("B");
          al.add("K");
          al.add("L");
          
        System.out.println("before sorting"+al);// [ZAKLL] 
         Collections.sort(al, new MyComparator ());
      System.out.println("after sorting"+al);// [ZLLKA]
     }
}
