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

        WebElement radioButton = driver.findElement(By.cssSelector("label[for='yesRadio']"));

        boolean isEnable = radioButton.isEnabled();
        if(isEnable){
            radioButton.click();
            System.out.println("Button was clicked");
        }

        WebElement output = driver.findElement(By.className("mt-3"));
        System.out.println(output.getText());

    }
}
