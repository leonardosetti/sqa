import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ExerciseSelenium {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://www2.boitempoeditorial.com.br/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLoadPage() {
        Assert.assertEquals("Boitempo Editorial", driver.getTitle());
    }

    @Test
    public void testFindElement001() {
        WebElement loginElement = driver.findElement(By.className("loginOn"));
        WebElement loginMail = driver.findElement(By.id("LoginEmail"));
        WebElement loginPassword = driver.findElement(By.id("LoginSenha"));
        WebElement btnEntrar = driver.findElement(By.className("btGray"));

        loginElement.click();
        loginMail.sendKeys("email@email.com");
        loginPassword.sendKeys("senha@123");
        btnEntrar.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.out.println(driver.getCurrentUrl());
//TODO
        //Assert.assertEquals("https://www2.boitempoeditorial.com.br/identificacao", driver.getCurrentUrl());

//      WebElement msgErro = driver.findElement(By.className("mensagem-erro"));
//      Assert.assertEquals("Usuário ou senha inválidos", msgErro.getAttribute("value"));

    }

    @Test
    public void testFindElement002() {

    }

    @Test
    public void testFindElement003() {

    }

}
