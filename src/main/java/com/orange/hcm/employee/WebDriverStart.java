package com.orange.hcm.employee;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;



public class WebDriverStart {
	
	public static RemoteWebDriver remoteWebDriver;
	
	public static RemoteWebDriver launchBrowser() throws MalformedURLException
	{
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		URL url = new URL("https://oauth-rajeshmscbe-0bec3:26fce4cb-8121-4a1a-a76a-bdffee6e9a80@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		remoteWebDriver = new RemoteWebDriver(url, browserOptions);
		remoteWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return remoteWebDriver;
		
	}

}
