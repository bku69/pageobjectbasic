package de.bku.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import de.bku.base.Page;
import de.bku.pages.HomePage;
import de.bku.pages.LoginPage;
import de.bku.pages.ZohoAppPage;
import de.bku.pages.crm.CRMHomePage;
import de.bku.pages.crm.accounts.AccountsPage;
import de.bku.pages.crm.accounts.CreateAccountPage;

public class LoginTest extends Page {

	public static void main(String[] args) {
		
		// This is a rough package
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("tankret69@gmail.com", "Laber13%");
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("Testname");
	}
}
