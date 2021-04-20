import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogleBrowsers {

    @Test
    public void TestFirefox() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.br");
        Assert.assertEquals("Google", driver.getTitle());
        driver.quit();
    }

    @Test
    public void TestChrome () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.br");
        Assert.assertEquals("Google", driver.getTitle());
        driver.quit();
    }

}
