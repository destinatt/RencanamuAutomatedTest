package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class GooglePage {
    private WebDriver driver;
    private By buttonGoogle = By.xpath("//*[@id=\"login\"]/div/div/ul/li[2]/a");
    private By idEmail = By.xpath("//*[@id=\"identifierId\"]");
    private By buttonNextGoogle = By.xpath("//*[@id=\"identifierNext\"]/span/span");
    private By idPassword = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        driver.findElement(buttonGoogle).click();
    }

    public void setEmail(String emailGoogle){
        driver.findElement(idEmail).sendKeys(emailGoogle);
    }

    public void setPassword(String passwordGoogle){
        driver.findElement(idPassword).sendKeys(passwordGoogle);
    }

    public void buttonNext(){
        driver.findElement(buttonNextGoogle).click();
    }

    public MapPage clickNextToLogin(){
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        return new MapPage(driver);
    }

}

