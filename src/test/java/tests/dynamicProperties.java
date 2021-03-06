package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicProperties {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebElement disableButton = driver.findElement(By.xpath("//div/p"));
        String disableButtonText = disableButton.getText();
        System.out.println("Button is disable yet");

        WebElement afterEnable = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(afterEnable));
        afterEnable.click();

        WebElement colorChanged = driver.findElement(By.id("colorChange"));
        boolean isVisible = colorChanged.isEnabled();

        if (isVisible){
            System.out.println("Button is visible");
            colorChanged.click();
        }






    }
}
