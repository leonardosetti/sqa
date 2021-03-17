package automation.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

       //this is a method just to exemplify a method call by object in another class (Parent for example)
    public static void setWebdriver() {
        System.setProperty("webdriver.chrome.driver", "../../webdrivers/chromedriver");

    }

    public static String myDriver(){
        WebDriver wbdriver = new ChromeDriver();
        wbdriver.get("http://localhost:80");

        String title = wbdriver.getTitle();
        String result;
        if (title.equals("Apache2 Debian Default Page: It works")){
            result = "PASS";
        } else {
            result = "FAIL";
        }
        return result;
    }

}
