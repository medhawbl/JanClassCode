package com.wbl.collections;

public class ArrayExample {

	public static void namesid(int ids, String names){
		System.out.println(ids +"   "+names);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ids={1,2,3};
		String[] strs={"hi","hello","hey"};
		for(int i=0;i<3;i++){
		namesid(ids[i],strs[i]);
		}

	}

}
