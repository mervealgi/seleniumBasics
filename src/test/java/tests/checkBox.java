package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkBox {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxValue = "label[for='tree-node-home'] span.rct-checkbox svg.rct-icon";
        WebElement homeCheckBox = driver.findElement(By.cssSelector("label[for='tree-node-home'] span.rct-checkbox svg.rct-icon"));
        homeCheckBox.click();

        homeCheckBox = driver.findElement(By.cssSelector("label[for='tree-node-home'] span.rct-checkbox svg.rct-icon"));
        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");
        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
        System.out.println("Checkbox is checked.");
        }else {
            System.out.println("Checkbox is unchecked.");
        }
    }
}
