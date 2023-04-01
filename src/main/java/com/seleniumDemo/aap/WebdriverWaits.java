package com.seleniumDemo.aap;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaits {
	
	public void fluentWait(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		//wait till a condition
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofMillis(5000)).pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchFieldException.class);
		// implement wait condition
		wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.tagName("button"));
				return element;
			}
		});
		// find and click
		driver.findElement(By.tagName("button")).click();
		 // switch to the alert
		driver.switchTo().alert().accept();
	}
	
public void webDriverWait(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		//use webdriver wait
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait condition
//		wait.until(ExpectedConditions.alertIsPresent());
		
		// find and click
		driver.findElement(By.tagName("button")).click();
		 // switch to the alert
		driver.switchTo().alert().accept();
	}


}
