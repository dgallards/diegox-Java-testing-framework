package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver driver;

    @FindBy(id = "menu-toggle")
    WebElement menuToggle;

    @FindBy(id = "btn-login")
    WebElement loginButton;

    @FindBy(id = "txt-username")
    WebElement usernameField;

    @FindBy(id = "txt-password")
    WebElement passwordField;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openMenu() {
        menuToggle.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }




}