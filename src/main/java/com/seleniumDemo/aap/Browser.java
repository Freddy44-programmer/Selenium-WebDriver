package com.seleniumDemo.aap;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

	public static WebDriver getBrowser(String browser) {
		
	 WebDriver driver = null;
	 
	 //open browser
	 if (browser.equalsIgnoreCase("chrome")) {
		 String path = System.getProperty("user.dir") + File.separator + "src" + File.separator +
				 "main" + File.separator + "resources" + File.separator + "chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		 
	 } else if (browser.equalsIgnoreCase("firefox")) {
		 String path = System.getProperty("user.dir") + File.separator + "src" + File.separator +
				 "main" + File.separator + "resources" + File.separator + "geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver", path);
		 driver = new FirefoxDriver();
		 
	}else if (browser.equalsIgnoreCase("safari")) 
		 driver = new SafariDriver();
		 
		else 
			System.out.println("Browser not supported" + browser);
	     driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	} 
}
