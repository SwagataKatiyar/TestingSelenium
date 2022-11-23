package com.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.util.WebBrowser;

public class WorkingOnCheckbox {

	@Test
	public void selectCheckBox() {
		WebDriver driver = WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement chkbox = driver.findElement(By.id("remember"));
		if (!chkbox.isSelected()) {
			chkbox.click();// check previously unchecked checkbox
		}
	}

}
