package de.bku.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import de.bku.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoHome() {

	}

	public void gotoFeeds() {

	}

	public void gotLeads() {

	}

	public AccountsPage gotoAccounts() {
		Page.click("accountstab_XPATH");
		return new AccountsPage();
	}
	
	public void gotoContacts() {

	}
	
	public void signOut() {
		
	}
}
