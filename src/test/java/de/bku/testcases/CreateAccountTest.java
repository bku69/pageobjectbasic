package de.bku.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;
import de.bku.base.Page;
import de.bku.pages.ZohoAppPage;
import de.bku.pages.crm.accounts.AccountsPage;
import de.bku.pages.crm.accounts.CreateAccountPage;
import de.bku.utilities.Utilities;


public class CreateAccountTest extends BaseTest {

	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String, String> data) {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("Create Account Test failed!!");
	}
}
