package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapPage {
    private WebDriver driver;
    private By statusResendEmail = By.xpath("//*[@id=\"resend_vrf\"]/strong");
    private By alertTextForFacebook = By.xpath("//*[@id=\"heding_title\"]/div/div/h1");
    private By alertText = By.xpath("//*[@id=\"heding_title\"]/div/div[2]");


    public MapPage(WebDriver driver) {
        this.driver  = driver;
    }

    public String getStatusResendEmail(){
        return driver.findElement(statusResendEmail).getText();
    }

    public String getAlertTextForFacebook(){
        return driver.findElement(alertTextForFacebook).getText();
    }

    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }
}
