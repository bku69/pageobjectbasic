package de.bku.pages.crm.accounts;

import org.openqa.selenium.By;

import de.bku.base.Page;

public class AccountsPage extends Page {
	
	public CreateAccountPage gotoCreateAccounts() {
		click("createaccountbtn_XPATH");
		return new CreateAccountPage();
	}
	
	public void gotoImportAccounts() {
	}
}
