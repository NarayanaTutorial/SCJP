package com.narayanatutorial.collections.arrays;

import java.util.Arrays;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };

		Arrays.sort(a); // sort by natural order

		System.out.println(Arrays.binarySearch(a, 14)); // -5

		String[] s = { "A", "Z", "B" };
		System.out.println(Arrays.binarySearch(s, "C"));
		Arrays.sort(s);

		System.out.println(Arrays.binarySearch(s, "Z")); // 2
		System.out.println(Arrays.binarySearch(s, "s")); // -4

		Arrays.sort(s, new MyComparator2());

		System.out.println(Arrays.binarySearch(a, new MyComparator2().compare("B", "A"))); // 2
		System.out.println(Arrays.binarySearch(s, "C"));
	}
}
