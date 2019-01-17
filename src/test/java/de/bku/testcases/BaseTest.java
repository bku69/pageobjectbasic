package de.bku.testcases;

import org.testng.annotations.AfterSuite;

import de.bku.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page.quit();
	}

}
