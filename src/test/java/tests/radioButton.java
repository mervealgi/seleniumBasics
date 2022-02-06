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
            System.out.println("Radio button was clicked");
        }

        WebElement assertButton = driver.findElement(By.id("yesRadio"));
        boolean isSelected = assertButton.isSelected();
        if(isSelected){
            System.out.println("Radio button was selected");
        }

        WebElement output = driver.findElement(By.cssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement radiButtonNo = driver.findElement(By.id("noRadio"));
        System.out.println(radiButtonNo.isEnabled());

    }
}
