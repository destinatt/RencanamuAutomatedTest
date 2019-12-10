package Assessment;

import Base.BaseTest;
import Login.LoginTests;
import Pages.LoginPage;
import Pages.MapPage;
import Pages.PengenalanDiriPage;
import org.testng.annotations.Test;

public class PengenalanDiriTests extends BaseTest {


    @Test
    public void testSuccessfulPD () throws InterruptedException {
        setUp();
        LoginPage loginPage = homePage.clickMasukForLogin();
        loginPage.setUsernameField("foo@mailinator.com");
        Thread.sleep(3000);
        loginPage.setPasswordField("des");
        Thread.sleep(5000);
        MapPage mapPage = loginPage.clickLoginButton();
        Thread.sleep(5000);
        PengenalanDiriPage pengenalanDiriPage = new PengenalanDiriPage();
        pengenalanDiriPage.PengenalanDiriPage(driver);
        Thread.sleep(15000);
    }

}
