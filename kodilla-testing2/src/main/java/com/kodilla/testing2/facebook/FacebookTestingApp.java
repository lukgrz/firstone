package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_COOKIES = "//div[contains(@class, \"9xo5\")]/button[2]";
    private static final String XPATH_CREATE_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    private static final String XPATH_DAY = "//select[@name=\"birthday_day\"]";
    private static final String XPATH_MONTH = "//select[@name=\"birthday_month\"]";
    private static final String XPATH_YEAR = "//select[@name=\"birthday_year\"]";

    public static void main (String[] Args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).click();

        //while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        //Don't know why that don't work

        Thread.sleep(5000);

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select daySelector = new Select(selectDay);
        daySelector.selectByIndex(10);
        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelector = new Select(selectMonth);
        monthSelector.selectByIndex(5);
        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelector = new Select(selectYear);
        yearSelector.selectByIndex(30);
    }
}
