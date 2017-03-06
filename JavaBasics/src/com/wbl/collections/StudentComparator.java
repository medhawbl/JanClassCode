package com.wbl.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
