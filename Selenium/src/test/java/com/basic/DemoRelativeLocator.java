package com.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.util.WebBrowser;

public class DemoRelativeLocator {
	
	@Test
	public void filterProduct() throws InterruptedException {
		
	WebDriver driver = WebBrowser.openBrowser("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	//Thread.sleep(3000);
	
	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));

	 wait.until(ExpectedConditions.visibilityOfElementLocated(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//span[text()='Android']"))));
	
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	WebElement chkbrand= driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//span[text()='Android']")));
	
	if(!chkbrand.isSelected()) {
		js.executeScript("arguments[0]",chkbrand);
	}
	}
	

}
