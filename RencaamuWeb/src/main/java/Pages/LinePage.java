package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LinePage {
    private WebDriver driver;
    private By idEmail = By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/fieldset/div[1]/input");
    private By idPassword = By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/fieldset/div[2]/input");
    private By iconLine = By.xpath("//*[@id=\"login\"]/div/div/ul/li[3]/a");
    private By loginButton = By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/fieldset/div[3]");
    //*[@id="app"]/div/div/div/div[2]/div/form/fieldset/div[1]/input

    public LinePage(WebDriver driver){
        this.driver = driver;
        driver.findElement(iconLine).click();
    }

    public void setEmail(String email){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(idEmail).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(idPassword).sendKeys(password);
    }

    public MapPage clickButtonLoginLine() {
        driver.findElement(loginButton).click();
        return new MapPage(driver);
    }

}
