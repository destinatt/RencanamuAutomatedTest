package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    private void clickLink( String xpathText){
        driver.findElement(By.xpath(xpathText)).click();
    }

    public LoginPage clickMasukForLogin(){
        //Click button Masuk
        clickLink("//*[@id=\"top-nav\"]/ul/li[4]/a");
        return new LoginPage(driver);
    }

    public FacebookPage clickMasukForFacebook(){
        clickLink("//*[@id=\"top-nav\"]/ul/li[6]/a");
        return new FacebookPage(driver);
    }

    public GooglePage clickMasukForGoogle() throws InterruptedException {
        clickLink("//*[@id=\"top-nav\"]/ul/li[6]/a");
        Thread.sleep(1000);
        return new GooglePage(driver);
    }

    public LinePage clickMasukForLine(){
        clickLink("//*[@id=\"top-nav\"]/ul/li[6]/a");
        return new LinePage(driver);
    }

    public RegisterPage clickMasukForRegister(){
        clickLink("//*[@id=\"top-nav\"]/ul/li[6]/a");
        return new RegisterPage(driver);
    }

}
