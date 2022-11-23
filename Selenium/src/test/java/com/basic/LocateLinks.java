package com.basic;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.util.WebBrowser;

public class LocateLinks {
    WebDriver driver;

   @BeforeClass
    public void openPage() {
        driver = WebBrowser.openBrowser("https://www.google.in/");
    }

   @Test
    public void images() {
        driver.findElement(By.linkText("Images")).click();
        String acttitle = WebBrowser.getTitle(driver);
        assertEquals(acttitle.trim(), "Google Images");
        /* The trim() method removes whitespace from both ends of a string and returns a new string,
        without modifying the original string. */
        driver.navigate().back();
    }


   @Test
    public void advertising() {
       
        driver.findElement(By.linkText("Advertising")).click();
        assertEquals(WebBrowser.getTitle(driver).trim(), "Get More Customers With Easy Online Advertising | Google Ads");
        driver.navigate().back();
    }



   @Test
    public void search() {
        driver.findElement(By.partialLinkText("Search")).click();
        String acttitle = WebBrowser.getTitle(driver);
        assertEquals(acttitle.trim(), "Google Search – Discover how Google Search works");
        driver.navigate().back();
    }
}