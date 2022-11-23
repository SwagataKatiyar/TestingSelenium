package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.util.WebBrowser;

@Test
public class DynamicMenus {
	public void selectMenu() {
	WebDriver driver = WebBrowser.openBrowser("https://demo.automationtesting.in/Register.html");
	Actions builder= new Actions(driver);
	//WebElement menu= driver.findElement(By.linkText("SwitchTo"));
	List<WebElement> menus= driver.findElements(By.cssSelector("li.dropdown > a"));
	for(WebElement menu:menus) {
		if(menu.getText().equals("SwitchTo")){
			builder.moveToElement(menu).perform();
			break;
		}
	}
	List<WebElement> submenus= driver.findElements(By.cssSelector("ul.dropdown-menu>li>a"));
	
	for(WebElement submenu: submenus) {
		if(submenu.getText().equals("Windows")) {
			submenu.click();
			break;
		}
	}
	
	
	
	
	}

}
