package com.wbl.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueAndStackExample {
	
	public static void stackExample(){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(34);
		stack.push(35);
		stack.push(36);
		stack.push(37);
		stack.push(1);
		
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()){
			//LIFO- pop method returns last added element in stack first
			System.out.println(stack.pop());
		}
		
	}
	
	public static void main(String args[]){
		/*
		//it follows natural sort order if we do not set any priority
		PriorityQueue<String> pq = new PriorityQueue<String>(new PriorityComparator());
		
		pq.add("mango");
		pq.add("apple");
		pq.add("banana");
		pq.add("guava");
		
		//System.out.println("before::"+pq.size());
		//peek returns the first element
		//System.out.println(pq.peek());
		//poll returns and removes the first element
		//System.out.println(pq.poll());
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext()){
			System.out.println(pq.poll());
		}
		
		System.out.println("after::"+pq.size());*/
		stackExample();
		
	}

}
