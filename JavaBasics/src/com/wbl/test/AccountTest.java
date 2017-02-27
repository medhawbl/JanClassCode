package com.wbl.test;

import com.wbl.oops.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account();
		//a.setAccountId(-98989);
		a.setAccountHolderName("Richa");
		a.withdrawl();
		System.out.println(a.getAccountId());

	}

}
