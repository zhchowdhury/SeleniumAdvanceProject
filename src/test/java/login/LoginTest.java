package login;

import PageController.LoginController;
import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {

    LoginController login;

    @BeforeTest
    public void Init(){
        beforeTest();
    }

    @Test
    public void verifySignInButton(){
        login = new LoginController(driver);
        login.signInTab();


    }




}
