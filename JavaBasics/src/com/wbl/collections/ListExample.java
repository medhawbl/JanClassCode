package com.wbl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	
	public void listExample(){
		
		//creating the ArrayList object.
		List<Integer> ids = new ArrayList<Integer>(); 
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(4);
		ids.add(null);
		ids.add(null);
		
		
		List<String> names = new ArrayList<String>(); 
		names.add("Adam");
		names.add("Alan");
		names.add("Swetha");
		names.add("Sunita");
		names.add("Sunita");
		
		names.add(3,"ferrari");
		
		/*//basic for loop
		for(int i=0;i<ids.size();i++){
			System.out.println(ids.get(i));
		}
		
		//enhanced for loop - for each loop
		for(String name: names){
			System.out.println(name);
		}*/
		Collections.sort(ids);
		
		//using iterator
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	
	public void vectorExample(){
		Vector<Integer> ids = new Vector<Integer>(5,2); 
		
		System.out.println(ids.capacity());
		
		ids.add(10);
		ids.add(9);
		ids.add(11);
		ids.add(4);
		ids.add(5);
		ids.add(6);
		
		System.out.println(ids.capacity());
		
		ids.add(7);
		ids.add(8);
		//basic for loop
		for(int i=0;i<ids.size();i++){
			System.out.println(ids.get(i));
		}
				
	}
	
	public void linkedListExample(){
		LinkedList<Integer> ids = new LinkedList<Integer>(); 
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(4);
		ids.add(null);
		ids.add(null);

		
		ids.add(3,7886);
		
		for(int i=0;i<ids.size();i++){
			System.out.println(ids.get(i));
		}
		
	}
	
	public static void main(String args[]){
		ListExample le = new ListExample();
		le.linkedListExample();
		
		//le.vectorExample();
	}

}
