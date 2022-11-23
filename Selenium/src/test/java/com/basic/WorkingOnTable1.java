package com.basic;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.util.WebBrowser;

public class WorkingOnTable1 {
@Test
	public void verifyRowData() {
		int rowno=3;
	    String data="Meta;Francisco Chang;Mexico";
	    List<String> expData= Arrays.asList(data.split(";"));
	    List<String> actData= new ArrayList<>();
	    WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
	    List<WebElement> rowdata= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+rowno+"]/td"));
	   for (WebElement cell : rowdata) 
		{
	   actData.add(cell.getText());
		}

	    assertEquals(actData,expData);
	  //*[@id="customers"]/tbody/tr[2]/td[1]
	}


@Test
public void verifyCellData() {
	int rowno=3;
	int colno=3;
	String expData="Mexico";
	WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
	WebElement cell= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+rowno+"]/td["+colno+"]"));
	String actData= cell.getText();
	assertEquals(actData,expData);
}
	
}
