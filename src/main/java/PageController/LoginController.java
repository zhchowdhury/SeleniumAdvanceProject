package PageController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginController {


    @FindBy(xpath ="//*[@id='header']//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    @FindBy(id ="email")
    WebElement userName;

    @FindBy(id ="passwd")
    WebElement userPassword;

    @FindBy(css ="#SubmitLogin > span")
    WebElement submitLogin;
    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    WebElement invalidLoginError;


    public LoginController(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void signInTab(){
        signInButton.isDisplayed();

    }
    public void invalidLogin()throws InterruptedException
    {
        Thread.sleep(1000);

        signInButton.click();
        userName.sendKeys("abcdef@gamil.com");
        userPassword.sendKeys("abcd1234");
        submitLogin.click();
        Assert.assertEquals(invalidLoginError,invalidLoginError);

    }

}
