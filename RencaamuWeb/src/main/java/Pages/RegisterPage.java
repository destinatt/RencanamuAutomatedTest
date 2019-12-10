package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private WebDriver driver;
    private By idDaftarDisini = By.xpath("//*[@id=\"login\"]/div/div/span[2]/a");
    private By idNama = By.xpath("//*[@id=\"myLogin\"]/div[2]/input");
    private By idEmail = By.xpath("//*[@id=\"myLogin\"]/div[3]/input");
    private By idPassword = By.xpath("//*[@id=\"myLogin\"]/div[4]/input");
    private By idRePassword = By.xpath("//*[@id=\"myLogin\"]/div[5]/input");
    private By idCheckbox = By.xpath("//*[@id=\"myLogin\"]/div[6]/div/label");
    private By buttonDaftar = By.xpath("//*[@id=\"myLogin\"]/button");
    //*[@id="check_info"]

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        driver.findElement(idDaftarDisini).click();
        System.out.println(driver.findElement(idCheckbox).isSelected());
    }

    public void setNama(String nama){
        driver.findElement(idNama).sendKeys(nama);
    }

    public void setEmail(String email){
        driver.findElement(idEmail).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(idPassword).sendKeys(password);
    }

    public void setRePassword(String rePassword){
        driver.findElement(idRePassword).sendKeys(rePassword);
    }
    public void clickCheckbox(){
        driver.findElement(idCheckbox).isDisplayed();

        WebElement yourChkBox  = driver.findElement(By.xpath("//*[@id=\"myLogin\"]/div[6]/div/label"));

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(yourChkBox));
        Actions act = new Actions(driver);
        act.moveToElement(yourChkBox).click().build().perform();

        System.out.println("display  awal?" + driver.findElement(idCheckbox).isDisplayed());
        System.out.println("Checkbox selected awal?" + driver.findElement(idCheckbox).isSelected());
        driver.findElement(idCheckbox).click();
        System.out.println("Checkbox selected?" + driver.findElement(idCheckbox).isSelected());
    }

    public MapPage clickButtonDaftar(){
        driver.findElement(buttonDaftar).click();
        return new MapPage(driver);
    }

}
