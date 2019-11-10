package PageObjects;

import ComSelPro.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage {

    public By productName = By.cssSelector("h4.product-name");

    public WebElement getProductName() {
        return Base.driver.findElement(productName);
    }
}
