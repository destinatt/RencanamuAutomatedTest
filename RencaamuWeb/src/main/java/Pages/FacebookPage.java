package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class FacebookPage {
    private WebDriver driver;
    private By idEmail = By.xpath("//*[@id=\"email\"]");
    private By idPassword = By.xpath("//*[@id=\"pass\"]");
    private By masukFacebook = By.xpath("//*[@id=\"loginbutton\"]");
    private By buttonFacebook = By.xpath("//*[@id=\"login\"]/div/div/ul/li[1]/a");

    public FacebookPage(WebDriver driver){
        this.driver = driver;
        driver.findElement(buttonFacebook).click();
    }

    public void setIdEmail(String emailFacebook) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(idEmail).sendKeys(emailFacebook);
    }

    public void setIdPassword(String passwordFacebook){
        driver.findElement(idPassword).sendKeys(passwordFacebook);
    }

    public MapPage clickLoginButtonFacebook(){
        driver.findElement(masukFacebook).click();
        return new MapPage(driver);
    }
}
