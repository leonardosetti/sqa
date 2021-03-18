package automation.selenium.java;

import org.openqa.selenium.By;

public class Locators {
    public static void callWebdriver() {
        ChkConf.setWebdriver();
    }

    public static void accssPage() {
        ChkConf.driver.get("http://automationpractice.com/");
    }

    public static void touchMenuSignin() {
        ChkConf.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
    }

    public static void fillUpMailField() {
        ChkConf.driver.findElement(By.id("email")).sendKeys("my@automation.test.com");
    }

    public static void fillUpPasswdField() {
        ChkConf.driver.findElement(By.id("passwd")).sendKeys("myPassword");
    }

}
