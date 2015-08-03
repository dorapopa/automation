package com.endava;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import javax.xml.ws.WebEndpoint;
import java.util.List;

/**
 * Created by dopopa on 8/3/2015.
 */
public class GmailTest {
    static WebDriver driver;


    @BeforeClass
    /*deschide pagina de mail */
    public static void before() {
     driver = new FirefoxDriver();
    }
    /*deschide pagina de firefox si se inchide*/
    @AfterClass
    public static void after(){
        driver.close();
    }
    /*deschide pagina de mail si se inchide*/
    @Before
    public void goToPage(){
        driver.get("http://mail.google.com");
    }
/**/

    @Test
    public void testGmail(){
      /*identificam elem si il punem intr-o variabila*/

        WebElement userNameField = driver.findElement(By.id("Email"));
        userNameField.sendKeys("antonia.im.jobs@gmail.com");


        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();
    }
}
