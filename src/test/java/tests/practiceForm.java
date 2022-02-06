package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceForm {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;        //checkbox can not seen
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement sportCheckbox = driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/input[@id='hobbies-checkbox-1']"));
        boolean isEnable = sportCheckbox.isEnabled();
        System.out.println(isEnable);


        WebElement sportCheckboxLabel = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));

        try {
            sportCheckbox.click();
        }catch (ElementClickInterceptedException e){
            sportCheckboxLabel.click();
            System.out.println("Im in the catch block");
        }

        boolean isSelected = sportCheckbox.isSelected();
        System.out.println(isSelected);
    }
}
