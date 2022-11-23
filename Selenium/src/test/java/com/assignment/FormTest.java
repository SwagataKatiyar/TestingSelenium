package com.assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.util.WebBrowser;

public class FormTest {
	@Test
	public void selectCheckbox() {
		WebDriver driver=WebBrowser.openBrowser("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Vaibhav");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Sisodia");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Dhampur,Uttar Pradesh");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("vaibhav17696@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8938884320");
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("XYZ");
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("XYZ");
		
		
		driver.findElement(By.id("checkbox1")).click();
		WebElement dd=driver.findElement(By.id("Skills"));
		Select ddcolors=new Select(dd);
		ddcolors.selectByValue("AutoCAD");
		WebElement dr=driver.findElement(By.id("country"));
		Select ddcolors1=new Select(dr);
		ddcolors1.selectByValue("India");
		WebElement ds=driver.findElement(By.id("yearbox"));
		Select ddcolors2=new Select(ds);
		ddcolors2.selectByValue("1999");
		WebElement dt=driver.findElement(By.id("daybox"));
		Select ddcolors3=new Select(dt);
		ddcolors3.selectByValue("7");
		WebElement du=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select ddcolors4=new Select(du);
		ddcolors4.selectByValue("December");
		List<WebElement> radios=driver.findElements(By.name("radiooptions"));
		
		for(WebElement rb : radios) {
			if(rb.getAttribute("value").equals("Male")) {
				rb.click();
				break;
			}
		}
	}
	

}