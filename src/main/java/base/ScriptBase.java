package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptBase {

public WebDriver driver;


    public void beforeTest(){
                                                //  ./drivers/chromedriver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");

    }

}
