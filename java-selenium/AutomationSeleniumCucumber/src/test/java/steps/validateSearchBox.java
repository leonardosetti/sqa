package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class validateSearchBox {
    @Given("I am on <WebSite> Home Page")
public void i_am_on_web_site_home_page() {
        System.out.println("I am on <WebSite> Home Page");
}

@When("I click on SearchButton")
public void i_click_on_search_button() {
    System.out.println("I click on SearchButton");
}

@Then("the message <msg> shows up")
public void the_message_msg_shows_up() {
    System.out.println("the message <msg> shows up");
}
}
