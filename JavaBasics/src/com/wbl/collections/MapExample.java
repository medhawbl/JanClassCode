package com.wbl.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	
	public void hashMapExample(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(14543, "Smitha");
		map.put(14452, "swetha");
		map.put(2353, "jyoti");
		map.put(34234, "swetha");
		map.put(2353, "harry");//when same key is given new value, old value will be overridden
		map.put(null, "iyer");
		
		System.out.println("get value using key:"+map.get(14543));//map.get takes key as input and returns value
		
		Set<Integer> keys = map.keySet();
		//method 1
		/*for(Integer key: keys){
			System.out.println(key + "::"+ map.get(key));
		}*/
		//method 2
		//Set<Entry<Integer,String>> entries = map.entrySet();
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
		if(map.containsKey(2353)){
			System.out.println("key present");
		}
		if(map.containsValue("harry")){
			System.out.println("value present");
		}
		
	}
	
	public void hashMapUserDefinedObjectExample(){
		Map<Student,String> map = new HashMap<Student,String>();
		
		Student s1= new Student();
		s1.setId(1);
		
				
		Student s3= new Student();
		s3.setId(12);
		
		map.put(s1, "Smitha");
		map.put(s3, "jyoti");
		
		Student s2= new Student();
		s2.setId(1);
		
		System.out.println("get value using key:"+map.get(s2));//map.get takes key as input and returns value
		
		
		
	}
	
	public void linkedHashMapExample(){
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(14543, "Smitha");
		map.put(14452, "swetha");
		map.put(2353, "jyoti");
		map.put(34234, "swetha");
		map.put(2353, null);//when same key is given new value, old value will be overridden 
		map.put(null, "iyer");
		
		System.out.println("get value using key:"+map.get(14543));//map.get takes key as input and returns value
		
		Set<Integer> keys = map.keySet();
		/*
		for(int i=0;i<keys.size();i++){
			if(i==2){
				map.put(326732, "george");
			}
		}*/
		for(Integer key: keys){
			System.out.println(key + "::"+ map.get(key));
		}
		
	}
	public void hashTableExample(){
		Map<Integer,String> map = new Hashtable<Integer,String>();
		map.put(14543, "Smitha");
		map.put(14452, "swetha");
		map.put(2353, "jyoti");
		map.put(34234, "swetha");
		map.put(2353, "harry");//when same key is given new value, old value will be overridden 
		map.put(443, null);
		
		System.out.println("get value using key:"+map.get(14543));//map.get takes key as input and returns value
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key: keys){
			System.out.println(key + "::"+ map.get(key));
		}
		
	}
	
	
	public void treeMapExample(){
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(14543, "Smitha");
		map.put(14452, "swetha");
		map.put(2353, "jyoti");
		map.put(34234, "swetha");
		map.put(2353, null);//when same key is given new value, old value will be overridden 
		//map.put(null, "iyer");
		
		System.out.println("get value using key:"+map.get(14543));//map.get takes key as input and returns value
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key: keys){
			System.out.println(key + "::"+ map.get(key));
		}
		
	}

	public static void main(String[] args) {
		MapExample map = new MapExample();
		map.hashMapUserDefinedObjectExample();
		//System.out.println("***********************");
		//map.linkedHashMapExample();
		//System.out.println("***********************");
		//map.hashTableExample();
		System.out.println("***********************");
		//map.treeMapExample();
	}

}
