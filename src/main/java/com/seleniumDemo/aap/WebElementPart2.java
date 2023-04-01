package com.seleniumDemo.aap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementPart2 {

	public void openWebPageUsingNavigation(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
         //open facebook page using navigation class
		driver.navigate().to("https://www.facebook.com");
	}

public void handleBackwardNavigation(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
         //open facebook page using navigation class
		driver.navigate().to("https://www.facebook.com");
		//oepn w3school
		driver.navigate().to("https://www.w3schools.com");
		//backward navigation
		driver.navigate().back();
	}

public void handleForwardwardNavigation(String browser) {
	
	WebDriver driver = Browser.getBrowser(browser);
     //open facebook page using navigation class
	driver.navigate().to("https://www.facebook.com");
	//oepn w3school
	driver.navigate().to("https://www.w3schools.com");
	//backward navigation
	driver.navigate().forward();
}

public void handlePageRefresh(String browser) {
	
	WebDriver driver = Browser.getBrowser(browser);
     //open facebook page using navigation class
	driver.navigate().to("https://www.facebook.com");
	//refresh page
	driver.navigate().refresh();
}

public void handleMultipleWindows(String browser) {
	
	WebDriver driver = Browser.getBrowser(browser);
     //open w3school
	driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
	// print title of page
	System.out.println("Parent title is " + driver.getTitle());
	//switch to iframe
	driver.switchTo().frame("iframeResult");
	// capture window Id
	String parentWindowId = driver.getWindowHandle();
	
	System.out.println("Parent window id is" + parentWindowId);
	// click over button
	driver.findElement(By.tagName("button"));
	//get all window ids
	Set<String>  windIdsSet = driver.getWindowHandles();
	// convert to list
	List<String> windIdsList = new ArrayList<String>(windIdsSet);
	// switch to the child window
	driver.switchTo().window(windIdsList.get(1));
	// print title of child page
		System.out.println("Child title is " + driver.getTitle());
}
}
