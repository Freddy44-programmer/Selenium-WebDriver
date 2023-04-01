package com.seleniumDemo.aap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptExamples {
	
	public void invokeAlert(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.facebook.com");
		// create object of javascript executor
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		// execute alert() function
		executor.executeScript("alert ('This alert is injected by webdriver');");
	}

	public void sendTextToAnElement(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.facebook.com");
		// create object of javascript executor
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		// enter email
		executor.executeScript("document.getElementById('email').value='author2@gmail.com';");
		//enter password
		executor.executeScript("document.getElementByName('pass')[0].value='12345';");
		// click on button
		executor.executeScript("document.getElementById('loginbutton').click();");
	}
	

}
