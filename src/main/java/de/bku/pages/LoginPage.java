package de.bku.pages;

import org.openqa.selenium.By;

import de.bku.base.Page;

public class LoginPage extends Page {
	
	public ZohoAppPage doLogin(String username, String password) {
		
		type("email_CSS", username);
		type("password_CSS", password);
		click("signbtn_CSS");
		
		return new ZohoAppPage();
	}
}
