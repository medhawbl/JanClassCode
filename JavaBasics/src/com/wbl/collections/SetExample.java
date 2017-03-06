package com.wbl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public void setExample(){
		Set<String> set = new HashSet<String>();
		set.add("adam");
		set.add("blan");
		set.add("smitha");
		set.add("ggorge");
		set.add("jel");
		set.add("adam");
		set.add(null);
		
		for(String str:set){
			System.out.println(str);
		}
		
	}
	
	public void setUserDefinedObjects(){
		Set<Student> set = new HashSet<Student>();
		Student s1= new Student();
		s1.setId(1);
		s1.setName("Alan");
		System.out.println("hashcode for s1:"+s1.hashCode());
		
		Student s2= new Student();
		s2.setId(1);
		s2.setName("Alan");
		System.out.println("hashcode for s2:"+s2.hashCode());
		
		Student s3= new Student();
		s3.setId(12);
		s3.setName("Alans");
		System.out.println("hashcode for s3:"+s3.hashCode());
		
		System.out.println("s1 equals s2::"+s1.equals(s2));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println("size of set::"+set.size());			
		
	}
	public void linkedHashSetExample(){
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("adam");
		set.add("blan");
		set.add("smitha");
		set.add("ggorge");
		set.add("jel");
		set.add("adam");
		set.add(null);
		
		for(String str:set){
			System.out.println(str);
		}
	}
	
	public void treeSetExample(){
		Set<String> set = new TreeSet<String>();
		set.add("adam");
		set.add("blan");
		set.add("smitha");
		set.add("ggorge");
		set.add("jel");
		set.add("adam");
		set.add(null);
		
		for(String str:set){
			System.out.println(str);
		}
	}
	
	public void treeSetStudentsExample(){
		Set<Student> set = new TreeSet<Student>(new StudentComparator());
		Student s1= new Student();
		s1.setId(1);
		s1.setName("Alan");
		
		Student s2= new Student();
		s2.setId(34);
		s2.setName("harry");
		
		Student s3= new Student();
		s3.setId(12);
		s3.setName("victor");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		for(Student str:set){
			System.out.println(str.getId()+"::"+str.getName());
		}
	}

	public static void main(String[] args) {
		SetExample se = new SetExample();
		//se.setUserDefinedObjects();
		/*se.setExample();
		System.out.println("***********************");
		se.linkedHashSetExample();
		System.out.println("***********************");
		se.treeSetExample();*/
		se.treeSetStudentsExample();
	}

}
