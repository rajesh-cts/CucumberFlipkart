package com.orange.hcm.employee;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {
	
	RemoteWebDriver driver;
	
	public ProductSearchPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text() = 'SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']")
	public WebElement productLink;
	
	@FindBy(xpath = "//input[@title = 'Search for products, brands and more']")
	public WebElement searchBox;
	
	@FindBy(xpath = "//div[text()='Available offers']")
	public WebElement offers;

	
	public ProductSearchPage searchProduct(String s)
	{
		searchBox.sendKeys(Keys.ESCAPE);
		searchBox.sendKeys(s);
		searchBox.sendKeys(Keys.ENTER);
		productLink.click();
		return this;
	}
	
	public ProductSearchPage checkProductPrice()
	{
		String currentWindow = driver.getWindowHandle();
		for(String window : driver.getWindowHandles())
		{
			if(!currentWindow.equals(window))
			{
				driver.switchTo().window(window);
			}
		}
		System.out.println(offers.getText());
		return this;
	}

}
