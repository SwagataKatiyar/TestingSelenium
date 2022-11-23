package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.WebBrowser;

public class RadioExample {
	public void selectRadio() {
	WebDriver driver = WebBrowser.openBrowser("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	driver.findElement(By.name("software"));
	
	
	}

}
