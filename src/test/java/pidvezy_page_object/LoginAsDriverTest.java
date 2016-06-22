package pidvezy_page_object;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by VYNovik on 15.06.2016.
 */
public class LoginAsDriverTest {

    @Before
    public void enterStartPage() {
    open("http://www.pidvezy.org");
    }

    @Test
    public void LoginAsDriver() {

        //open("http://www.pidvezy.org");
        $(By.cssSelector("#main_registration > div:nth-child(2) > a.btn.btn-success.btn-lg")).click();
        $(By.id("email")).sendKeys("testfacebook1@i.ua");
        $(By.id("pass")).sendKeys("Testfaceb1");
        $(By.id("loginbutton")).click();
        $(By.className("dropdown")).shouldHave(text("Ivan Nikiforov"));

    }
    @Test
    public void LoginAsPassenger() {

        //open("http://www.pidvezy.org");
        $(By.cssSelector("#main_registration > div:nth-child(3) > a.btn.btn-success.btn-lg")).click();
        $(By.id("email")).sendKeys("testfacebook2@i.ua");
        $(By.id("pass")).sendKeys("Testfaceb2");
        $(By.id("loginbutton")).click();
        $(By.className("dropdown")).shouldHave(text("Nikita Kormiltsev"));

    }
    @Test
    public void RegistrationAsDriver(){
        $(By.cssSelector("button.btn-success")).click();
        $(By.cssSelector(".dropdown-menu > li:nth-child(1) > a:nth-child(1)")).click();
        $(By.id("email")).sendKeys("testfacebook1@i.ua");
        $(By.id("pass")).sendKeys("Testfaceb1");
        $(By.id("loginbutton")).click();
        $(By.className("dropdown")).shouldHave(text("Ivan Nikiforov"));
    }
    @Test
    public void RegistrationAsPassenger(){
        $(By.cssSelector("button.btn-success")).click();
        $(By.cssSelector(".dropdown-menu > li:nth-child(2) > a:nth-child(1)")).click();
        $(By.id("email")).sendKeys("testfacebook2@i.ua");
        $(By.id("pass")).sendKeys("Testfaceb2");
        $(By.id("loginbutton")).click();
        $(By.id("inputEmail")).clear();
        $(By.id("inputEmail")).sendKeys("testfacebook2@i.ua");
        $(By.id("inputLocation")).clear();
        $(By.id("inputLocation")).sendKeys("Київ");
        $(By.id("inputDescription")).clear();
        $(By.id("inputDescription")).sendKeys("QA");
        $(By.cssSelector(".btn-lg")).click();
        $(By.className("dropdown")).shouldHave(text("Nikita Kormiltsev"));
    }
    @After
    public void closeStartPage(){
        close();
    }
}


