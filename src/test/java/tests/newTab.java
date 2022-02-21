package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class newTab {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());

    }
}
