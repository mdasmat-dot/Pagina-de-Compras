package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import pages.LoginPage;
import pages.HomePage;

public class PurchaseSteps {

    WebDriver driver;
    RegisterPage register;
    LoginPage login;
    HomePage home;
    String email;

    @Given("que el usuario abre la pagina")
    public void abrirPagina() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
    }

    @When("se registra con un usuario nuevo")
    public void registrarUsuario() {
        email = "test" + System.currentTimeMillis() + "@mail.com";

        register = new RegisterPage(driver);
        register.registerUser(email);
    }

    @And("inicia sesion con el usuario creado")
    public void loginUsuario() {
        login = new LoginPage(driver);
        login.login(email);
    }

    @And("navega a la seccion tablets")
    public void irATablets() {
        home = new HomePage(driver);
        home.goToTablets();
    }

    @And("agrega un producto al carrito 5 veces")
    public void agregarProducto() {
        home.addTabletFiveTimes();
    }

    @Then("el producto se agrega correctamente al carrito")
    public void validarCompra() {
        // Aquí puedes validar el carrito (mensaje o contador)
        driver.quit();
    }
}