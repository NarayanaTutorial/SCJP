package com.narayanatutorial.collections.queue;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.peek());// null		
		try {
			System.out.println(q.element()); // NoSuchElementException	
		}catch(NoSuchElementException e) {
			System.out.println("No Such Element Exception.."+e);
		}
		for (int i = 0; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println("PriorityQueue:"+q);// 10,1,2,3,....10
		System.out.println("poll:"+q.poll()); // 0
		System.out.println("PriorityQueue:"+q); // [1,2,3,4.....10]
	}

}
