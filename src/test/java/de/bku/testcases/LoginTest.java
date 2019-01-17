package de.bku.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import de.bku.pages.HomePage;
import de.bku.pages.LoginPage;
import de.bku.pages.ZohoAppPage;
import de.bku.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String, String> data) {
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin(data.get("username"), data.get("password"));
		//Assert.fail("Login Test failed!!");
	}

}
