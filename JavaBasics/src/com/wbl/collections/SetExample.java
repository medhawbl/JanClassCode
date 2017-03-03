package com.wbl.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public void setExample(){
		Set<String> set = new HashSet<String>();
		set.add("adam");
		set.add("blan");
		set.add("smitha");
		set.add("ggorge");
		set.add("jel");
		set.add("adam");
		
		for(String str:set){
			System.out.println(str);
		}
		
	}

	public static void main(String[] args) {
		SetExample se = new SetExample();
		se.setExample();
	}

}
