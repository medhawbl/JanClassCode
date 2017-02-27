package com.wbl.oops;

public class AccountEnc {
	//encapsulation
	private int acctId;
	private String name;
	
	
	public int getAcctId() {
		return acctId;
	}
	public void setAcctId(int acctId) {
		if(acctId>0){
		this.acctId = acctId;
		}else{
			System.out.println("this is not valid id");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
