package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Método para escribir texto
    public void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    // Método para hacer click
    public void click(By locator) {
        driver.findElement(locator).click();
    }
}