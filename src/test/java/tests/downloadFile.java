package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class downloadFile {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String path = "C:\\Users\\Dell\\Downloads";   //your path
        String fileName = "sampleFile.jpg";
        Thread.sleep(5000);

        boolean isDownloaded = isFileDownloaded(path,fileName);
        System.out.println(isDownloaded);
    }

    public static boolean isFileDownloaded(String downloadPath, String fileName){

        File file = new File(downloadPath);
        File[] files = file.listFiles();

        for(int i = 0; i <files.length; i++){
            if(files[i].getName().equals(fileName)){
                return true;
            }
        }
        return false;
    }
}
