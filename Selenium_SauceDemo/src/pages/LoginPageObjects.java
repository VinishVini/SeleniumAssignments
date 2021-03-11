package pages;

import org.openqa.selenium.By;

public class LoginPageObjects {

    public By userNameTextBox = By.xpath("//input[@id='user-name']");
    public By passwordTextBox = By.xpath("//input[@id='password']");
    public By loginButton = By.xpath("//input[@type='submit']");
    public By userNameText = By.xpath("//div[@id='login_credentials']");
    public By passwordText = By.xpath("//div[@class='login_password']");
}
