package automation.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkConf {

    static WebDriver driver = new ChromeDriver();

    public static void setWebdriver() {
        System.setProperty("webdriver.chrome.driver", "../../webdrivers/chromedriver");
    }

    public static String touchBrowser() {
        driver.get("https://distrowatch.com/");

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String title_result;
        String url_result;
        if (title.equals("DistroWatch.com: Put the fun back into computing. Use Linux, BSD.")) {
            title_result = "TITLE_PASS";
        } else {
            title_result = "TITLE_FAIL";
        }

        if (url.equals("https://distrowatch.com/")) {
            url_result = "URL_PASS";
        } else {
            url_result = "URL_FAIL";
        }
        return url_result + " // " + title_result;
    }

    public static void quitTest() {
        driver.quit();
    }


}
