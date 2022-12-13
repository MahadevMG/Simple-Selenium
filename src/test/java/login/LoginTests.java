package login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests{
	
	@Test
	public void testSuccessfulLogin() {
		LoginPage loginpage = homepage.clickFormAuthentication();
		loginpage.setUsername("tomsmith");
		loginpage.setPassword("SuperSecretPassword!");
		
		SecureAreaPage secureAreaPage = loginpage.clickLoginButton();
		assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area"), "Alert text is incorrect or login failed");
	}
}
