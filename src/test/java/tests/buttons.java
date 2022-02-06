package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        doubleClick.click();

    }
}
