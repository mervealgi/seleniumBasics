package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement radioButton = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]/input[@id='impressiveRadio']"));
        radioButton.click();

    }
}
