package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {
	
	      public static WebDriver openBrowser(String url) {
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  return driver;
		  
		  }
	      
	      public static String getTitle(WebDriver driver) {
			return driver.getTitle();
	    	  
	      }


}
