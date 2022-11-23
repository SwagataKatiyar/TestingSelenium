package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.util.WebBrowser;

public class AmazonCheckBox {
	
	@Test
	public void check() {
	WebDriver driver= WebBrowser.openBrowser("https://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Car Keys");
	driver.findElement(By.id("nav-search-submit-button")).click();
	WebElement checkbx= driver.findElement(By.className("a-icon-checkbox"));
	
	if(!checkbx.isSelected()) {
		checkbx.click();
	}
	
	}
	

}
