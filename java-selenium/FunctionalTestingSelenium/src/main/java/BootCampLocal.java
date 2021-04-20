import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootCampLocal {

    @Test
    public void testFirefox() {
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/componentes.html");
        driver.manage().window().setSize(new Dimension(1366, 741));
        Assert.assertEquals("Campo de Treinamento", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testChrome() {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com.br");
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/componentes.html");
        Assert.assertEquals("Campo de Treinamento", driver.getTitle());
        driver.quit();
    }


    @Test
    public void testChromeTextField() {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com.br");
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/componentes.html");

        driver.findElement(By.id("elementosForm:nome")).sendKeys("NOME");
        Assert.assertEquals("NOME", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
        driver.quit();
    }

    @Test
    public void testChromeTextArea() {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com.br");
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/componentes.html");

        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("TEXT AREA \n MULTI LINE \n XXXXXX");
        Assert.assertEquals("TEXT AREA \n MULTI LINE \n XXXXXX", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
        driver.quit();
    }

    @Test
    public void testChromeRadioButton() {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com.br");
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/componentes.html");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());

        driver.findElement(By.id("elementosForm:sexo:1")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
        driver.quit();
    }

    @Test
    public void testChromeCheckBox() {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com.br");
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/componentes.html");
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());
        driver.quit();
    }
}