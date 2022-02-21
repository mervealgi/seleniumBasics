package tests;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement uplButton = driver.findElement(By.id("uploadFile"));
        uplButton.sendKeys("C:\\Users\\Dell\\Desktop\\Antonio Tabucchi - Ufuk Çizgisi.pdf");
        String ActualTitle = driver.getTitle();
    }
}
