import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChromeBrowser {

	public static void main(String[] args) {

		// 1. create the webdriver object

		// invoke the browser
		// The below code line can be suppressed if you have the path to your WebDriver
		// defined in $PATH system variable
		// note: the executable WebDriver for Linux OS is two folder levels up from
		// current project folder
		System.setProperty("webdriver.chrome.driver", "../../webdrivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/en/");
		driver.getTitle();

	}

}
