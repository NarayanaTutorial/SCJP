package com.narayanatutorial.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemoComparator {

	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(5);
		Collections.sort(al, new MyComparatorInteger());
		System.out.println("al:"+al);
		System.out.println(Collections.binarySearch(al, 10, new MyComparatorInteger()));
		System.out.println(Collections.binarySearch(al, 13, new MyComparatorInteger()));
		System.out.println(Collections.binarySearch(al, 17));// unPredicatable

	}
}
