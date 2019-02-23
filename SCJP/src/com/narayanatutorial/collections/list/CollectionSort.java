package com.narayanatutorial.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Z");
		al.add("B");
		al.add("K");
		al.add("N");
		// al.add (new integer(10));// ClassCastException
		// al.add(null);// NullPointerException
		System.out.println("before sorting" + al);
		Collections.sort(al);// [ZAKN]
		System.out.println("after sorting" + al);// [AKNZ]
	}
}
