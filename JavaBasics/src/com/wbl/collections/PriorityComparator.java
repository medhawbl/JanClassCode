package com.wbl.collections;

import java.util.Comparator;

public class PriorityComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		//strings sorted in desc order
		/*
		if(s2<s1){
			return -1;
		}else if(s2>s1){
			return 1;
		}else{
			return 0;
		}*/
		return s2.compareTo(s1);		
		
		
		
	}

}
