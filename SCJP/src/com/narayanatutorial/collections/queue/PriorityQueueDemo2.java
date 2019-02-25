package com.narayanatutorial.collections.queue;

import java.util.PriorityQueue;



public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<String> q =new PriorityQueue<String>(new Mycomparator());
         q.offer("A");
         q.offer("B");
         q.offer("Z");
         q.offer("L");
       System.out.println("customize sorting order:"+q); // [ZLBA] 
       
       
       PriorityQueue<String> q1 =new PriorityQueue<String>(new Mycomparator().reversed());
       q1.offer("A");
       q1.offer("B");
       q1.offer("Z");
       q1.offer("L");
     System.out.println("customize sorting order with reversed method of comparator:"+q1); // [ZLBA] 
       
       
	}

}
