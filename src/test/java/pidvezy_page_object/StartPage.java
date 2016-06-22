package pidvezy_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by VYNovik on 07.06.2016.
 */
public class StartPage {

    private WebDriver driver;

    @FindBy(linkText = "Я-водій")
    WebElement iDriver;

    @FindBy(linkText = "Я-пасажир")
    WebElement iPassenger;

    public StartPage (WebDriver driver){
        this.driver=driver;
        new WebDriverWait(driver,7).until(visibilityOfElementLocated(By.linkText("Я-водій")));

    }

   // public
}
