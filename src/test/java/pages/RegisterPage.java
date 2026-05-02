package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Localizadores
    By myAccount = By.xpath("//span[text()='My Account']");
    By registerBtn = By.linkText("Register");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By agree = By.name("agree");
    By continueBtn = By.xpath("//button[@type='submit']");

    public void registerUser(String mail) {
        click(myAccount);
        click(registerBtn);

        type(firstName, "Mario");
        type(lastName, "Davila");
        type(email, mail);
        type(password, "123456");

        click(agree);
        click(continueBtn);
    }
}