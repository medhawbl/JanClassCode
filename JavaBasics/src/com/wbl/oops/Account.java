package com.wbl.oops;

public class Account {
	
	private int accountId;
	private String accountHolderName;
	private String adress;
	private String accountType;
	private float amount;
	
	public void displayTransactions(){
		System.out.println("TRANSACTIONS");
	}
	
	public void withdrawl(){
		System.out.println("WITHDRAW");
	}
	
	
	public int getAccountId(){
		return accountId;
	}
	
	/*public void setAccountId(int id){
		if(id>0){
		accountId=id;
		}else{
			System.out.println("this is not a valid account number");
		}
	}*/

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
	

}
