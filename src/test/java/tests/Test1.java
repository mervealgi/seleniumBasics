package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test1 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Merve");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("mervealgi@gmail.com");

        WebElement currentAdres = driver.findElement(By.id("currentAddress"));
        currentAdres.sendKeys("İstanbul");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("İstanbul");

        JavascriptExecutor js = (JavascriptExecutor) driver;        //submit button can not seen
        js.executeScript("window.scrollBy(0,250)", "");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();



    }


}
