package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.util.WebBrowser;

public class WorkingOnLists {
	
	@Test
	public void selectItemFromList()
	{
		WebDriver driver = WebBrowser.openBrowser("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.className("a-dropdown-prompt")).click();
		
		List<WebElement> sortOption = driver.findElements(By.cssSelector("li.a-dropdown-item>a"));
		
		for(WebElement option: sortOption)
		{
			if(option.getText().equals("Price: High to low"))
			{
				option.click();
			}
		}
	}

}
