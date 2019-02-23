package com.narayanatutorial.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSearchDemo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		Collections.sort(al);
		System.out.println("al:"+al);
		System.out.println(Collections.binarySearch(al, "Z"));
		System.out.println(Collections.binarySearch(al, "j"));
	}
}
