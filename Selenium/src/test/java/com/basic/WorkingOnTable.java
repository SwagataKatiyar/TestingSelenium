package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.util.WebBrowser;

public class WorkingOnTable {

	@Test
	public void getTableData() {

		WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table = driver.findElement(By.id("customers"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement r : rows) 
		{
			List<WebElement> cells = r.findElements(By.tagName("td"));
			for (WebElement c : cells) 
			{
				System.out.println(c.getText());
			}
		}

		driver.close();
	}

}
