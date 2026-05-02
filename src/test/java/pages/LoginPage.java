package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By myAccount = By.xpath("//span[text()='My Account']");
    By loginBtn = By.linkText("Login");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginSubmit = By.xpath("//button[@type='submit']");

    public void login(String mail) {
        click(myAccount);
        click(loginBtn);

        type(email, mail);
        type(password, "123456");

        click(loginSubmit);
    }
}