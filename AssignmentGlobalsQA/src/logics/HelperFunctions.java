package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Locale;

public class HelperFunctions {




    public void loginURL(WebDriver driver, String URL)
   {
       driver.get(URL);

   }

   public void verifyText(WebDriver driver,By xpathValue , String expectedText)
   {
       String actualText = driver.findElement(xpathValue).getText();
       Assert.assertEquals(actualText,expectedText);
   }

   public void clickElement(WebDriver driver , By xpathValue)
   {
       driver.findElement(xpathValue).click();
   }
   public void selectDropDown(WebDriver driver, By xpathValue , int value)
   {
       Select select = new Select(driver.findElement(xpathValue));
       select.selectByIndex(value);
   }
    public void selectDropDown(WebDriver driver, By xpathValue , String text , String visibleOrValue)
    {
        Select select = new Select(driver.findElement(xpathValue));
        String newText = visibleOrValue.toUpperCase();
        if(newText.equals("VISIBLE"))
        {
            select.selectByVisibleText(text);
        }
        else if(newText.equals("VALUE"))
        {
            select.selectByValue(text);
        }
    }

    public void scrollPage(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

}
