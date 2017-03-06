package com.wbl.collections;

import java.util.Comparator;

public class Student{ // implements Comparable<Student> {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return id*7;
	}
	
	@Override
	public boolean equals(Object o){
		Student s2=null;
		if(o instanceof Student){
		s2 =(Student)o;
		}
		if(null!=s2 && this.id==s2.id ){
			return true;
		}
		
		
		if(o instanceof Student && this.id==((Student)o).id){
			return true;
		}
		
		return false;
	}
	
	/*@Override
	public int compareTo(Student s2) {
		return ((String)this.name).compareTo(s2.name);
	}*/
	/*@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.name.compareTo(arg1.name);
	}*/

}
