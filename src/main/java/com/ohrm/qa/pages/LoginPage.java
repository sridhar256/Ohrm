package com.ohrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "txtUsername")
	WebElement Username;

	@FindBy(id = "txtPassword")
	WebElement Password;

	@FindBy(id = "btnLogin")
	WebElement Login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String username,String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		Login.click();
		
		return new HomePage();
	}

}
