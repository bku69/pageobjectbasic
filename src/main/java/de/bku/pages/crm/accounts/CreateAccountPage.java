package de.bku.pages.crm.accounts;

import org.openqa.selenium.By;

import de.bku.base.Page;

public class CreateAccountPage extends Page {
	
	public void createAccount(String accountName) {	
		type("accountname_CSS", accountName);
	}

}
