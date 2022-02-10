package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class downloadFile {

    public static void main(String[] args){

        System.setProperty("chromedriver.driver.crome","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String downloadPath = "Users/Dell/Downloads";
        String downloadFileName = "sampleFile.jpg";

        boolean isDownloaded = isFileDownloaded(downloadPath,downloadFileName);
        System.out.println(isDownloaded);
    }

    public static boolean isFileDownloaded(String path, String fileName){

        File file = new File(path);
        File[] files = file.listFiles();

        for(int i = 0; i <files.length; i++){
            if(files[i].getName().equals(fileName)){
                return true;
            }
        }return false;
    }
}
