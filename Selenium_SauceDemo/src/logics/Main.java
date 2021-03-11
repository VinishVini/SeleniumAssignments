package logics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class Main {


    public static void main(String[] args) throws Exception{

        System.setProperty("web.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.saucedemo.com";
        String productName = "Sauce Labs Backpack";
        LoginPage login = new LoginPage();
        login.loginToSauceDemo(driver,URL);
        
        ProductPage product = new ProductPage();
        product.selectProduct(driver,productName);

        CartPage cart = new CartPage();
        cart.cartPage(driver,productName);

        CheckoutPage checkOut = new CheckoutPage();
        checkOut.checkoutPage(driver,"Vinish","N","641027");

        driver.close();

    }


}

