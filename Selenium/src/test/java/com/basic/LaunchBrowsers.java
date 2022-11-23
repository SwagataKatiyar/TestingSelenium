package com.basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowsers {
    @Test
	public void openChrome() {
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
	  ChromeDriver driver= new ChromeDriver(); //it launches an empty browser
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");

	  String title= driver.getTitle();
	  System.out.println("Title of the page:"+ title);
	  System.out.println("Current Url:" + driver.getCurrentUrl());
	  driver.close();
	  
	  }

}
