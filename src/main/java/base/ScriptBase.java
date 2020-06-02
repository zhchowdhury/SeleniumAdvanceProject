package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ScriptBase {

public WebDriver driver;
    @Parameters({"browser","environment"})
    @BeforeClass
    public void beforeTest(String browser,String environment){
        if (browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver");

            driver = new FirefoxDriver();
        }

        if(environment.equalsIgnoreCase("dev")){

            driver.get("http://automationpractice_dev.com");

        }else if (environment.equalsIgnoreCase("qa")){

            driver.get("http://automationpractice_qa.com");

        }else if (environment.equalsIgnoreCase("int")){

            driver.get("http://automationpractice.com");

        }


        //driver.get("http://automationpractice.com");

    }
    @AfterClass
    public void closeBrowser(){

        driver.quit();
}
}
