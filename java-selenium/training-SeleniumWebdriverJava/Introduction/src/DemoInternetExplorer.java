import com.google.common.collect.Interner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoInternetExplorer {
    public static void main(String[] args) {

        // 1. create the webdriver object

        // invoke the browser
        // The below code line can be suppressed if you have the path to your WebDriver
        // defined in $PATH system variable
        // note: the executable WebDriver for Linux OS is two folder levels up from
        // current project folder

        //GeckoDriver:
        System.setProperty("webdriver.ie.driver", "../../webdrivers/geckodriver");

        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.selenium.dev/documentation/en/");
        System.out.println(driver.getTitle());
    }

}
