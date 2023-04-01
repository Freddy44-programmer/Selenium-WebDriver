package com.seleniumDemo.aap;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class app {

	public static void main(String[] args) {
		/*
		 * 1. Ask user for its browser
		 * 2.Validate user input
		 * 3. run example on user provided browser
		 */ 
		
		
		System.out.println("Please enter browser of your choice: Firefox, Chrome or safari");
		Scanner scanner = new Scanner(System.in);
		String browser = scanner.next();
		
		//example class
		//ElementFindingExamples examples = new ElementFindingExamples();
		//WebElementPart1 examples = new WebElementPart1();
		//WebElementPart2 examples = new WebElementPart2();
		//webTables examples = new webTables();
		//WebdriverWaits examples = new WebdriverWaits();
		JavascriptExamples examples = new JavascriptExamples();
		if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("chrome") ||
				browser.equalsIgnoreCase("safari")) {
			
			// code to be executed
			//examples.findElementByName(browser);
			//examples.findElementById(browser);
			//examples.findElementByLinkText(browser);
			//examples.findElementByPatialLinkText(browser);
			//examples.findElementByXPath(browser);
			//examples.findElementByCss(browser);
			//examples.handleCheckbox(browser);
			//examples.handleRadioButton(browser);
			//examples.handleDropdown(browser);
			//examples.openWebPageUsingNavigation(browser);
			//examples.handleBackwardNavigation(browser);
			//examples.handleForwardwardNavigation(browser);
			//examples.handlePageRefresh(browser);
			//examples.handleMultipleWindows(browser);
			//examples.getSingleElementFromWebTable(browser);
			//examples.getAllElementFromWebTable(browser);
			//examples.fluentWait(browser);
			//examples.invokeAlert(browser);
			examples.sendTextToAnElement(browser);
			
		}else 
			
			System.out.println("Browser " + browser + " you entered not supported");
	

	}

}
