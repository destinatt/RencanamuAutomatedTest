package Login;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        setUp();
        LoginPage loginPage = homePage.clickMasukForLogin();
        loginPage.setUsernameField("prod@mailinator.com");
        Thread.sleep(3000);
        loginPage.setPasswordField("des");
        Thread.sleep(5000);
        MapPage mapPage = loginPage.clickLoginButton();
        Thread.sleep(3000);
        assertTrue(mapPage.getAlertText().contains("Selamat bergabung di "), "Alert text is incorrect");
    }

    @Test
    public void testSuccessfulLoginFacebook() throws InterruptedException {
        setUp();
        FacebookPage facebookPage = homePage.clickMasukForFacebook();
        facebookPage.setIdEmail("destinatalia99@ymail.com");
        facebookPage.setIdPassword("");
        MapPage mapPage = facebookPage.clickLoginButtonFacebook();
        Thread.sleep(3000);
        assertTrue(mapPage.getAlertTextForFacebook().contains("Selamat bergabung di "), "Alert text is incorrect");
    }

    @Test
    public void testSuccessfulLoginGoogle() throws InterruptedException {
        setUp();
        Thread.sleep(5000);
        GooglePage googlePage = homePage.clickMasukForGoogle();
        Thread.sleep(2000);
        googlePage.setEmail("desti@youthmanual.com");
        Thread.sleep(1000);
        googlePage.buttonNext();
        Thread.sleep(2000);
        googlePage.setPassword("123desti123");
        Thread.sleep(5000);
        MapPage mapPage = googlePage.clickNextToLogin();
        Thread.sleep(2000);
        assertTrue(mapPage.getAlertText().contains("Selamat bergabung di "), "Alert text is incorrect");
    }

    @Test
    public void testSuccessfulLoginLine() throws InterruptedException {
        setUp();
        Thread.sleep(2000);
        LinePage linePage = homePage.clickMasukForLine();
        Thread.sleep(1000);
        linePage.setEmail("destinatalia99@ymail.com");
        Thread.sleep(1000);
        linePage.setPassword("");
        Thread.sleep(1000);
        MapPage mapPage = linePage.clickButtonLoginLine();
        Thread.sleep(5000);
        assertTrue(mapPage.getAlertTextForFacebook().contains("Selamat bergabung di "), "Alert text is incorrect");
    }
}
