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
import java.util.concurrent.TimeUnit;

/**
 * Created by dopopa on 8/3/2015.
 */
public class GmailTest {
    static WebDriver driver;


    @BeforeClass
    /*deschide pagina de mail */
    public static void before() {
     driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        userNameField.sendKeys("dora2013popa@gmail.com");


        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();

        WebElement userPassField = driver.findElement(By.id("Passwd"));
        userPassField.sendKeys("d0raakcedo");

        WebElement singInButton = driver.findElement(By.id("signIn"));
        singInButton.click();


       /* WebElement composeButton = driver.findElement(By.className("z0"));
        composeButton.click();
*/
        WebElement clickButton = driver.findElement(By.xpath(".//*[@id=':it']/div/div"));
        clickButton.click();


        WebElement toField = driver.findElement(By.className("vO"));
        toField.sendKeys("dora.popa@endava.com");

        WebElement SubjectField = driver.findElement(By.className("aoT"));
        SubjectField.sendKeys("test");


        WebElement BodyField = driver.findElement(By.className("Am"));
        BodyField.sendKeys("test");


      WebElement SendButton = driver.findElement(By.className("aoO"));
        SendButton.click();


    }
}
