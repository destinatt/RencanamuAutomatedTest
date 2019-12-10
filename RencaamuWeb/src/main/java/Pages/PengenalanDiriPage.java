package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class PengenalanDiriPage<IWebElement, IList> {
    WebDriver driver;
    private By btnPengenalanDiri = By.xpath("//*[@id=\"pengenalan_diri\"]/div[1]/a");
    private By btnMulaiKenalan = By.id("bdata");
    private By btnGender = By.xpath("//*[@id=\"f_gender\"]/div[2]/label[2]/img");
    private By btnSelanjutnya = By.xpath("//*[@id=\"f_gender\"]/div[4]/button");
    private By inputBirthdayDate = By.xpath("//*[@id=\"f_tanggal_lahir\"]/div[2]/div/div/input");
    private By btnSelanjutnyaBD = By.xpath("//*[@id=\"f_tanggal_lahir\"]/div[3]/button[2]");
    private By radioStatusSMP = By.xpath("//*[@id=\"f_status\"]/div[2]/div[1]/label[1]/img");
    private By btnSelanjutnyaStatus = By.xpath("//*[@id=\"f_status\"]/div[3]/button[2]");
    private By searchSchoolTxt = By.id("ajaxSMP");
    private By dropdownKelas = By.id("select2-drop-mask");
    private Object TimeSpan;

    public void PengenalanDiriPage (WebDriver driver) throws InterruptedException {
        this.driver = driver;
        driver.findElement(btnPengenalanDiri).click();
        driver.findElement(btnMulaiKenalan).click();
        driver.findElement(btnGender).click();
        driver.findElement(btnSelanjutnya).click();
        Thread.sleep(2000);
        driver.findElement(inputBirthdayDate).sendKeys("12121997");
        driver.findElement(btnSelanjutnyaBD).click();
        Thread.sleep(2000);
        driver.findElement(radioStatusSMP).click();
        driver.findElement(btnSelanjutnyaStatus).click();
        Thread.sleep(30000);
        //driver.findElement(searchSchoolTxt).click();
        /*WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(searchSchoolTxt));
        element1.click();
        driver.findElement(searchSchoolTxt).sendKeys("SMP 103");*/
        //  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select2-chosen-1\"]"))).click();
        driver.findElement(searchSchoolTxt).sendKeys("SMP 103");
        Thread.sleep(10000);


     /*   *//**
         * Example for Visibility of Elements located by
         *//*

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"select2-results-1\"]")));
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"select2-results-1\"]"));

        System.out.println("Auto Suggest List ::" + list.size());
        for(int i = 0 ;i< list.size();i++) {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("SMP NEGERI 103 (Kota Jakarta Timur)")) {
                list.get(i).click();
                break;
            }
        }*/
        driver.findElement(searchSchoolTxt).submit();
        Thread.sleep(2000);
        driver.findElement(dropdownKelas).click();
        driver.findElement(By.xpath("//*[@id=\"f_smp_school\"]/div[4]/div/div/div/ul/li[2]")).click();
        Thread.sleep(5000);

    }
    public static void selectFromDropDown(WebElement element , String Visibletext){
        Select select = new Select(element);
        select.selectByVisibleText(Visibletext);
    }


}
