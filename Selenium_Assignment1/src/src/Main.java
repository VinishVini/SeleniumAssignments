package src;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

class VerifyTakeScreenShot {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.setProperty("web.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        driver.manage().window().maximize();

        /* Clicking the Chapter 1 link and verifying the title inside the Chapter 1
        * then take screenshot of the page */
        driver.findElement(By.linkText("Chapter1")).click();
        verifyTitle(driver);
        takeScreenshot(driver,"Screenshots\\Chapter1.png");
        driver.navigate().back();
       
        
        /* Clicking the Chapter 2 link and verifying the title inside the Chapter 2
         * then take screenshot of the page */
        driver.findElement(By.linkText("Chapter2")).click();
        verifyTitle(driver);
        takeScreenshot(driver,"Screenshots\\Chapter2.png");
        driver.navigate().back();


        driver.findElement(By.linkText("Chapter3")).click();
        verifyTitle(driver);
        takeScreenshot(driver,"Screenshots\\Chapter3.png");
        driver.navigate().back();


        driver.findElement(By.linkText("Chapter4")).click();
        verifyTitle(driver);
        takeScreenshot(driver,"Screenshots\\Chapter4.png");
        driver.navigate().back();


        driver.findElement(By.linkText("Chapter8")).click();
        verifyTitle(driver);
        takeScreenshot(driver,"Screenshots\\Chapter8.png");
        driver.navigate().back();
        driver.close();

    }

    public static void verifyTitle(WebDriver driver)
    {
        String expectedTitle = "Selenium: Beginners Guide";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle))
        {
            System.out.println("Got the expected Title");
        }
        else
        {
            System.out.println("Titles are not same ");
        }

    }

    public static void takeScreenshot(WebDriver driver,String path) throws IOException {
        File source = ((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(path));


    }

}
