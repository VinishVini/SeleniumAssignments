package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ProductPageObjects;

public class ProductPage extends ProductPageObjects {

    public void selectProduct(WebDriver driver, String productName) throws Exception
    {
        driver.findElement(By.xpath("//div[text()='"+productName+"']")).click();
        driver.findElement(addToCart).click();
        String productDescText = driver.findElement(productDesc).getText();
        String priceText = driver.findElement(price).getText();

        driver.findElement(cart).click();
        Thread.sleep(5000);
    }

}
