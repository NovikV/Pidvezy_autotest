package pidvezy_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by VYNovik on 16.06.2016.
 */
public class ClearCookies {
    WebDriver driver;
   public void clearCookies() {
         driver = new FirefoxDriver();
        driver.get("localhost//about:preferences#privacy");
        $(By.id("historyRememberCookies")).click();

    }
}
