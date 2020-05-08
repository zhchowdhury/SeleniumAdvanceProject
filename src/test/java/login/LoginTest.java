package login;

import PageController.LoginController;
import base.ScriptBase;
import javafx.scene.layout.Priority;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {

    LoginController  login;  // Init LoginController Class Object

    @BeforeTest              // before Run the Test Init() all object from ScriptBase Class
    public void Init() {

        beforeTest();        // Calling from ScriptBase Class @ beforeTest() all functionality
    }

    @Test (priority = 1)
    public void verifySignInButton() {
        login = new LoginController(driver);
        login.signInTab();


    }

    @Test (priority = 2)
    public void verifyInvalidLogin() throws InterruptedException {
        login = new LoginController(driver);
        login.invalidLogin(driver,"There is 1 error");

    }


}