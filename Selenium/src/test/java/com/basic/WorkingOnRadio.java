package com.basic;
import java.util.List;
import com.util.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WorkingOnRadio {
	
	@Test
	public void selectRadio() {
		
		WebDriver driver = WebBrowser.openBrowser("https://echoecho.com/htmlforms10.htm");
		List<WebElement> radios = driver.findElements(By.name("group1"));
		
		for(WebElement rb: radios) {
			if(rb.getAttribute("value").equals("Milk"))
			{
				rb.click();
				break;
			}
		}
		
		for(WebElement rb: radios) {
			if(rb.getAttribute("value").equals("Cheese"))
			{
				rb.click();
				break;
			}
		}
	}

}
