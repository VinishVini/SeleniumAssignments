package logics;

import org.openqa.selenium.WebDriver;
import pages.LoginPageObjects;

public class LoginPage  extends LoginPageObjects {

    public void loginToSauceDemo(WebDriver driver,String URL) throws Exception
    {
        driver.get(URL);
        driver.manage().window().maximize();
        String textUserName = driver.findElement(userNameText).getText();
        String textPassWord = driver.findElement(passwordText).getText();
        String splitUserNameText[] = textUserName.split(":");
        String splitPassWordText[] = textPassWord.split(":");
        String userName = splitUserNameText[1].substring(0,splitUserNameText[1].indexOf("user")+4);
        String password = splitPassWordText[1];
        System.out.println(password);
        driver.findElement(userNameTextBox).sendKeys(userName);
        driver.findElement(passwordTextBox).sendKeys(password);
        driver.findElement(loginButton).click();
        Thread.sleep(5000);


    }

}
