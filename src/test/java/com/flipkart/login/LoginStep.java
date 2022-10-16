package com.flipkart.login;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.orange.hcm.employee.LoginPage;
import com.orange.hcm.employee.WebDriverStart;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	private RemoteWebDriver remoteWebDriver;

	@Before
	public void before() throws MalformedURLException {
		remoteWebDriver = WebDriverStart.launchBrowser();
	}

	@Given("User open Application")
	public void user_open_application() {
		remoteWebDriver.get("https://www.flipkart.com/");
	}

	@Given("User click the login button")
	public void user_click_the_login_button() {

	}

	@When("User enter userName and Password")
	public void user_enter_user_name_and_password(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps();
		LoginPage login = new LoginPage(remoteWebDriver);
		System.out.println(data.get(0).get("userName"));
		login.Login(data.get(0).get("userName"), data.get(0).get("password"));
	}

	@When("user click login button")
	public void user_click_login_button() {
		
	}

	@Then("User should be able to see the name on menu")
	public void user_should_be_able_to_see_the_name_on_menu() {
		new LoginPage(remoteWebDriver).checkUser();
	}

	@After
	public void tearDown()
	{
		remoteWebDriver.quit();
	}
}
