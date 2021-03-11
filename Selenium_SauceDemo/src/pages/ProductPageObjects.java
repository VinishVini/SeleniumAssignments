package pages;

import org.openqa.selenium.By;

public class ProductPageObjects {

    public By addToCart = By.xpath("(//button[text()='ADD TO CART'])[1]");
    public By price = By .xpath("//div[@class='inventory_details_price']");
    public By cart = By.xpath("//*[@role='img']");
    public By productDesc = By.xpath("//div[@class='inventory_details_desc']");



}
