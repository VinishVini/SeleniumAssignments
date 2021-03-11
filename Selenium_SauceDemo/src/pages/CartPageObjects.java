package pages;

import org.openqa.selenium.By;

public class CartPageObjects {

    public By productNameCartPage = By.xpath("//div[text()='Sauce Labs Backpack']");
    public By priceCartPage= By.xpath("(//div[@class='inventory_item_price'])[1]");
    public By productDescCartPage = By.xpath("//div[@class='inventory_item_desc']");
    public By checkout = By.xpath("//a[text()='CHECKOUT']");

}
