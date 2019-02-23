package com.narayanatutorial.collections.set;

import java.util.TreeSet;

public class NavigableSetDemo {

 public static void main (String[] args)             
 {           
	 TreeSet<Integer> t = new TreeSet<Integer> ();               
	 t.add(1000);                       
	 t.add(2000);                
	 t.add(3000);            
	 t.add(4000);                
	 t.add(5000);           
	 System.out.println("treeset:"+t); // 1000,2000,3000,4000,5000          
	 System.out.println("ceiling:"+t.ceiling(2000)); //2000           
	 System.out.println("higher:"+t.higher(2000)); //3000           
	 System.out.println("floor:"+t.floor(3000)); //3000          
	 System.out.println("lower:"+t.lower(3000)); //2000          
	 System.out.println("pollFirst:"+t.pollFirst()); //1000          
	 System.out.println("pollLast:"+t.pollLast()); //5000           
	 System.out.println("Final treeset:"+t); //2000,3000,4000           
	 }
 }


