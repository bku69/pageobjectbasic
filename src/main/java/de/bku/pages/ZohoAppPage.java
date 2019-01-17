package de.bku.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import de.bku.base.Page;
import de.bku.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	/*private WebDriver driver;
	
	public ZohoAppPage(WebDriver driver) {
		this.driver = driver;
	}*/
	
	public void gotoChat() {
		
	}
	
	public CRMHomePage gotoCRM() {
		click("closebtn_CSS");
		click("crmlink_CSS");
		return new CRMHomePage();
	}
	
	public void gotoSalesIQ() {
		driver.findElement(By.cssSelector(".zicon-apps-salesiq zicon-apps-96")).click();
	}
}
