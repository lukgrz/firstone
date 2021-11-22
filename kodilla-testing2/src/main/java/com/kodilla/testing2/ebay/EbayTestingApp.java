package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {

    public static void main (String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.ebay.com/");

        WebElement searchField = webDriver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
