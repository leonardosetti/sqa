package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class validateSearchBox {
    WebDriver driver;
    WebElement searchTool = driver.findElement(By.className("btGoSearch"));
    WebElement searchBox = driver.findElement(By.name("data[Busca][keyword]"));

    @Given("I am on BoiTempo Home Page")
    public void i_am_on_boi_tempo_home_page() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www2.boitempoeditorial.com.br/");
        driver.manage().window().maximize();
    }

    @When("I click on SearchButton")
    public void i_click_on_search_button() {
        searchTool.click();
    }

    @Then("the search box shows up")
    public void the_search_box_shows_up() {
        Assert.assertEquals("true",searchBox.isDisplayed());
    }
}
