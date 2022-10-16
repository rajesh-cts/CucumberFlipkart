package com.flipkart.search;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.orange.hcm.employee.ProductSearchPage;
import com.orange.hcm.employee.WebDriverStart;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SerachProductStep {
	
	private RemoteWebDriver remoteWebDriver;
	private ProductSearchPage productSearchPage;

	@Before
	public void before() throws MalformedURLException {
		remoteWebDriver = WebDriverStart.launchBrowser();
		productSearchPage = new ProductSearchPage(remoteWebDriver);
	}
	
	@Given("User open Application")
	public void user_open_Application() {
		remoteWebDriver.get("https://www.flipkart.com/");
	}
	
	@When("User search the {string}")
	public void user_search_the(String product) {
		productSearchPage.searchProduct(product);
	}

	@When("User click the search")
	public void user_click_the_search() {
	   
	}

	@Then("User should be able to see the search result \"")
	public void user_should_be_able_to_see_the_search_result() {
		productSearchPage.checkProductPrice();
	}
	

	@After
	public void tearDown()
	{
		remoteWebDriver.quit();
	}


}
