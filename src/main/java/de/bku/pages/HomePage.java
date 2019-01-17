package de.bku.pages;

import org.openqa.selenium.By;

import de.bku.base.Page;


public class HomePage extends Page {
	
	public void goToSupport() {
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void goToSignUp() {
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	
	public LoginPage goToLogin() {
		click("loginlink_CSS");
		return new LoginPage();
	}
	
	public void goTolearnMore() {
		
	}
	
	public void validateFooterLinks() {
		
	}
}
