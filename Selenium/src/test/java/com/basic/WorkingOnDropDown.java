package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.WebBrowser;
import org.testng.annotations.Test;

public class WorkingOnDropDown {

	@Test
	public void selectItemByValue() {
		boolean flag = false;
		WebDriver driver = WebBrowser.openBrowser("https:demoqa.com/select-menu");

		WebElement dd = driver.findElement(By.id("oldSelectMenu"));
		Select ddcolors = new Select(dd);

		List<WebElement> options = ddcolors.getOptions();
		for (WebElement op : options) {
			if (op.getAttribute("value").equals("5")) {
				ddcolors.selectByValue("5");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Incorrect option sent!!");
		}

	}

	@Test
	public void selectItemByText() {
		boolean flag = false;
		WebDriver driver = WebBrowser.openBrowser("https://demoqa.com/select-menu");

		
		Select ddcolors = new Select(driver.findElement(By.id("oldSelectMenu")));

		List<WebElement> options = ddcolors.getOptions();
		for (WebElement op : options) {
			if (op.getText().equals("purple")) 
			{
				ddcolors.selectByVisibleText("purple");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Incorrect option sent!!");
		}

	}

}
