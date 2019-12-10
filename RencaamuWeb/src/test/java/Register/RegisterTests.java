package Register;

import Base.BaseTest;
import Pages.MapPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends BaseTest {

    @Test
    public void testSuccessfulRegister() throws InterruptedException {
        setUp();
        Thread.sleep(1000);
        RegisterPage registerPage = homePage.clickMasukForRegister();
        Thread.sleep(2000);
        registerPage.setNama("Automation");
        registerPage.setEmail("auto@mailinator.com");
        registerPage.setPassword("123desti");
        registerPage.setRePassword("123desti");
        Thread.sleep(5000);
        registerPage.clickCheckbox();
        Thread.sleep(5000);
        MapPage mapPage = registerPage.clickButtonDaftar();
        Thread.sleep(1000);
        assertTrue(mapPage.getAlertTextForFacebook().contains("Selamat bergabung di "), "Alert text is incorrect");
    }

}
