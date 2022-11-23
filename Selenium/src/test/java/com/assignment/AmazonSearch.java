package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.util.WebBrowser;

public class AmazonSearch {
	  WebDriver driver;

	   @BeforeClass
	    public void openingPage() {
	        driver = WebBrowser.openBrowser("https://www.amazon.com/");
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Car Keys");
        	driver.findElement(By.id("nav-search-submit-button")).click();
	    }
	   

}
