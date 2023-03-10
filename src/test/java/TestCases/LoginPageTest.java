package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Bases.OHRMBase;
import Pages.LoginPage;

public class LoginPageTest extends OHRMBase {
	
	LoginPage lp;
	
	@BeforeMethod
	public void BrowserCongifTest() {
		Intialization();
		lp = new Pages.LoginPage();
	}
	
	@Test
	public void ValidateTitleTest() {
		String ExpTitle = "OrangeHRM";
		String ActTitle = lp.getTitle();
		Assert.assertEquals(ExpTitle, ActTitle);
	}
	@Test
	public void ValidateLogoTest() {
		Assert.assertTrue(lp.getLogo());
	}
	@Test
	public void ValidateLoginPageTest() throws IOException {
		boolean check = lp.getLoginPage();
		Assert.assertTrue(check);
		
	}
	@Test
	public void forgotPasswordTest() {
		Assert.assertTrue(lp.ForgotPassword());
		
	}
	@AfterMethod
	public void BrowserCloseTest() {
		TearDown();
	}

}
