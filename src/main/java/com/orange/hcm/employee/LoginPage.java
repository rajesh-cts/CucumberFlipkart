package com.orange.hcm.employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public RemoteWebDriver driver ;
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//form[@autocomplete='on']//input[@type='text']")
	public WebElement userName;
	
	@FindBy(xpath = "//form[@autocomplete='on']//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//form[@autocomplete='on']//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//div[text()='Rajesh']")
	public WebElement user;
	
	
	public LoginPage Login(String user , String pass) throws InterruptedException
	{
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
		Thread.sleep(5000);
		return this;
	}
	
	public LoginPage checkUser()
	{
		user.isDisplayed();
		return this;
	}
	

}
