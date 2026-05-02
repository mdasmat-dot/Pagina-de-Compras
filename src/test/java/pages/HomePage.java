package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By tabletsMenu = By.linkText("Tablets");
    By addToCartBtn = By.xpath("(//button[@title='Add to Cart'])[1]");

    public void goToTablets() {
        driver.findElement(By.linkText("Tablets")).click();
    }

    public void addTabletFiveTimes() {
        click(tabletsMenu);

        for (int i = 0; i < 5; i++) {
            click(addToCartBtn);
        }

    }
}
