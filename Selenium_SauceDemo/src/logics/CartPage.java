package logics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CartPageObjects;

public class CartPage extends CartPageObjects {

    public void cartPage(WebDriver driver,String productName) throws Exception
    {
        String productNameText = driver.findElement(By.xpath("//div[text()='"+productName+"']")).getText();
        if(productNameText.equals(productNameText))
            System.out.println("Product name are equal");
        else
            System.out.println("Product Names are not equal");
        
        driver.findElement(checkout).click();
        Thread.sleep(5000);
    }
    

}
