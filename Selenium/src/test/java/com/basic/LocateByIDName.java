package com.basic;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import com.util.WebBrowser;



public class LocateByIDName {
    @Test
    public void invalidLogin() {
        String experror = "Invalid Username/Password";
        WebDriver driver = WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2fLoginEmp.aspx");
        WebElement username = driver.findElement(By.id("txtCustomerID"));
        username.sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin@12");
        driver.findElement(By.name("Butsub")).click();
        WebElement lblerror = driver.findElement(By.id("lblMsg"));
        String acterror = lblerror.getText();

       assertEquals(acterror, experror);

       driver.close();

   }



}