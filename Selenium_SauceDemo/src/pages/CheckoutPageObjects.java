package pages;

import org.openqa.selenium.By;

public class CheckoutPageObjects {

    public By firstNameTextBox = By.xpath("//input[@id='first-name']");
    public By lastNameTextBox = By.xpath("//input[@id='last-name']");
    public By postalCodeTextBox = By.xpath("//input[@id='postal-code']");
    public By continueButton = By.xpath("//input[@type='submit']");
    public By finishButton = By.xpath("//a[text()='FINISH']");
    public By dispatchMessage = By.xpath("//div[@class='complete-text']");

}
