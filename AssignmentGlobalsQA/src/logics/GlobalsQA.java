package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectory.AlertBoxObjects;
import pageObjectory.DropDownObjects;
import pageObjectory.LoginObjects;
import pageObjectory.ToolTipObjects;

public class GlobalsQA extends HelperFunctions {

    static WebDriver driver;
    LoginObjects login = new LoginObjects();
    AlertBoxObjects alertBox = new AlertBoxObjects();
    DropDownObjects dropDown = new DropDownObjects();
    ToolTipObjects toolTipObj = new ToolTipObjects();
    PropertyFile property;
    Actions action;

    @BeforeMethod
    public void initBrowser() throws Exception
    {
        System.setProperty("web.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        property = new PropertyFile("Property.properties");
        loginURL(driver,property.getData("URL"));
        driver.manage().window().maximize();
    }

    @Test
    public void verifyAlertBox() throws Exception
    {
        try {

            WebElement ele = driver.findElement(login.testerHubDropDown);
            WebElement ele1 = driver.findElement(login.testingSite);
            action = new Actions(driver);
            action.moveToElement(ele).perform();
            action.moveToElement(ele1).perform();
            clickElement(driver, login.alertBox);
            Thread.sleep(3000);
            verifyText(driver, alertBox.textAlertBox, "AlertBox");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void verifyDropDown() throws Exception
    {
        try {
            WebElement ele = driver.findElement(login.testerHubDropDown);
            WebElement ele1 = driver.findElement(login.testingSite);
            action = new Actions(driver);
            action.moveToElement(ele).perform();
            action.moveToElement(ele1).perform();
            clickElement(driver, dropDown.dropDown);
            Thread.sleep(3000);
            verifyText(driver, dropDown.textDropDown, "DropDown Menu");
            selectDropDown(driver, dropDown.selectDropDownValue, 2);
            Thread.sleep(2000);
            selectDropDown(driver, dropDown.selectDropDownValue, "Afghanistan", "Visible");
            Thread.sleep(2000);
            selectDropDown(driver, dropDown.selectDropDownValue, "AND", "Value");
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyToolTip() throws Exception
    {
        try {
            WebElement ele = driver.findElement(login.testerHubDropDown);
            WebElement ele1 = driver.findElement(login.testingSite);
            action = new Actions(driver);
            action.moveToElement(ele).perform();
            action.moveToElement(ele1).perform();
            clickElement(driver, toolTipObj.toolTip);
            Thread.sleep(3000);
            verifyText(driver, toolTipObj.textToolTip, "Tooltip");
            clickElement(driver, toolTipObj.buttonVideo);
            Thread.sleep(2000);
            scrollPage(driver);
            WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
            driver.switchTo().frame(frame);
            action.moveToElement(driver.findElement(ToolTipObjects.buttonLike));
            String actualTooltip = driver.findElement(toolTipObj.buttonLike).getAttribute("title");
            Assert.assertEquals(actualTooltip, "I like this");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeBrowser() throws Exception
    {
        Thread.sleep(2000);
        driver.close();
    }

}
