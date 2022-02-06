package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicProperties {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebElement disableButton = driver.findElement(By.xpath("//div/p"));
        String disableButtonText = disableButton.getText();
        System.out.println("disableButtonText");






    }
}
