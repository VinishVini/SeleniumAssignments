package logics;

import org.openqa.selenium.WebDriver;
import pages.CheckoutPageObjects;

public class CheckoutPage extends CheckoutPageObjects {

    public void checkoutPage(WebDriver driver,String firstName,String lastName,String postalCode) throws Exception

    {
        driver.findElement(firstNameTextBox).sendKeys(firstName);
        driver.findElement(lastNameTextBox).sendKeys(lastName);
        driver.findElement(postalCodeTextBox).sendKeys(postalCode);
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
        Thread.sleep(5000);
        String expectedText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";

        if(driver.findElement(dispatchMessage).getText().equals(expectedText))
        {
            System.out.println("Dispatch message is same");
        }
        else
        {
            System.out.println("Dispatch message is not same");
        }

    }

}
