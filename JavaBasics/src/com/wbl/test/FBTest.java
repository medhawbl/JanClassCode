package com.wbl.test;

import com.wbl.oops.interfaces.AndroidFacebookApp;
import com.wbl.oops.interfaces.IFacebookApp;

public class FBTest {

	public static void main(String[] args) {
		AndroidFacebookApp app = new AndroidFacebookApp();
		app.friendRequests();
		
		IFacebookApp app1 = new AndroidFacebookApp();
		app1.friendRequests();
	}

}
