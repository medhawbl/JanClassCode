package com.wbl.oops;

public class Employee extends RootEmp{
	
	
	public int id;
	public String name;
	
	
	public Employee(int id, String name){
		//getting method input and setting to global variables
		this.id=id;
		this.name=name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		//getting method input and setting to global variables
		this.name = name;
	}
	
	public static void main(String args[]){
		Employee emp = new Employee(4,"sita");
		emp.displayDetailsOfemp();
		System.out.println(emp.toString());

		System.out.println(emp.hashCode());
		System.out.println(emp.getName());
	}

}
