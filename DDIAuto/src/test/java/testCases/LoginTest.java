package testCases;

import org.testng.annotations.Test;



import basePackage.BaseClass;
import pageObjectsMethod.LoginAdmin;

public class LoginTest extends BaseClass {

	@Test
public void testRun() {
		LoginAdmin ad=new LoginAdmin(driver);
		ad.enterCredentials(properties.getProperty("adUN"), properties.getProperty("adPW"));
}}
