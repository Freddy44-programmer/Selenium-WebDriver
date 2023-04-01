package com.seleniumDemo.aap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By.ByTagName;

public class ElementFindingExamples {

	
	// find element by name
	public void findElementByName(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("http://www.facebook.com/");
		//find email webelement
		WebElement emailElement = driver.findElement(By.name("email"));
		//perfom any action
		emailElement.sendKeys("author@freddy.com");

	}
	
	// find element by id

	public void findElementById(String browser) {
	
	WebDriver driver = Browser.getBrowser(browser);
	//open facebook
	driver.get("http://www.facebook.com/");
	//find email webelement
	WebElement emailElement = driver.findElement(By.id("pass"));
	//perfom any action
	emailElement.sendKeys("password");

}
	
	// find element by linktext

		public void findElementByLinkText(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("http://www.facebook.com/");
		//find email webelement
		WebElement emailElement = driver.findElement(By.linkText("Forgotten account?"));
		//perfom any action
		emailElement.click();

	}

		// find element by partiallinktext

				public void findElementByPatialLinkText(String browser) {
				
				WebDriver driver = Browser.getBrowser(browser);
				//open facebook
				driver.get("http://www.facebook.com/");
				//find email webelement
				WebElement emailElement = driver.findElement(By.partialLinkText("Fund"));
				//perfom any action
				emailElement.click();

			}

				// handle checkbox

				public void handleCheckbox(String browser) {
				
				WebDriver driver = Browser.getBrowser(browser);
				//open iframe page
				driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
				//switch to the parent iframe
				driver.switchTo().frame("iframeResult");
				//find first checkbox, select it 
				driver.findElement(By.name("vehicle1")).click();
				//sleep
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				//deselect checkbox
				driver.findElement(By.name("vehicle")).click();
			}
				
				
				// handle Radio button
				public void handleRadioButton(String browser) {
				
				WebDriver driver = Browser.getBrowser(browser);
				//open iframe page
				driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
				//switch to the parent iframe
				driver.switchTo().frame("iframeResult");
				//find first radio button and click over it
				driver.findElement(By.cssSelector("input[value='other']")).click();
				
				//sleep
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				driver.findElement(By.cssSelector("input[value='male']")).click();
			}
				

				// handle Alert
				public void handleAlert(String browser) {
				
				WebDriver driver = Browser.getBrowser(browser);
				//open iframe page
				driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryjsref_alert");
				//switch to the parent iframe
				driver.switchTo().frame("iframeResult");
				//find and click over the button
				driver.findElement(By.tagName("button")).click();
				//switch to the alert and get text
				Alert alert = driver.switchTo().alert();
				// print alert text
				System.out.println("Alert text is " + alert.getText());
				// accept alert
				alert.accept();
				
			
	}
				

				// handle Dropdown
				public void handleDropdown(String browser) {
				
				WebDriver driver = Browser.getBrowser(browser);
				//open iframe page
				driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
				//switch to the parent iframe
				driver.switchTo().frame("iframeResult");
				// find select element
				WebElement select = driver.findElement(By.tagName("select"));
				//initialize select object
				Select dropdown = new Select(select);
				dropdown.deselectByVisibleText("Volvo");
				
			
	}
				
}
