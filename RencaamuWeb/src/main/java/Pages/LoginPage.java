package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.xpath("//*[@id=\"login\"]/div/div/form/div[2]/input");
    private By passwordField = By.xpath("//*[@id=\"login\"]/div/div/form/div[3]/input");
    private By loginButton = By.xpath("//*[@id=\"login\"]/div/div/form/button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MapPage clickLoginButton (){
        driver.findElement(loginButton).click();
        return new MapPage(driver);
    }
}
