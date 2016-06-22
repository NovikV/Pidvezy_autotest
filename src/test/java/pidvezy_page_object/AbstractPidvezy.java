package pidvezy_page_object;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by VYNovik on 07.06.2016.
 */
public abstract class AbstractPidvezy {
    private static WebDriver driver;
    @BeforeClass
    public static void startBrowser() throws Exception{
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void stopBrowser(){
        if (driver!= null){
            driver.close();
        }
    }


}
