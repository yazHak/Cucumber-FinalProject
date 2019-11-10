package StepDef;

import ComSelPro.Base;
import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class StepDefinition {

    HomePage h;

    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        Base.getDriver().get(Base.prop.getProperty("url"));
        System.out.println("Chrome browser is invoked and navigated to the website :"+Base.prop.getProperty("url"));
    }

    @When("^User will search for \"([^\"]*)\"$")
    public void user_will_search_for_something(String strArg1) throws Throwable {
        //Base.driver.findElement(By.cssSelector("input[type='search']")).sendKeys(strArg1);
        System.out.println(strArg1+" item is typed on search box");

        h=new HomePage();
        h.getSearch().sendKeys(strArg1);
        Thread.sleep(2000);

    }

    @Then("^\"([^\"]*)\" result will be displayed$")
    public void something_result_will_be_displayed(String strArg1) throws Throwable {
        //if(Base.driver.findElement(By.cssSelector("img[src*='"+strArg1+"']")).isDisplayed())
        // or
        Assert.assertTrue(h.getProductName().getText().contains(strArg1));
    }

    @When("^User will search for \"([^\"]*)\" vegetable$")
    public void user_will_search_for_vegetable(String arg1) throws Throwable {
        new HomePage().getSearch().sendKeys(arg1);
    }

    @When("^User will add items to the cart$")
    public void user_will_add_items_to_the_cart() throws Throwable {
        HomePage h = PageFactory.initElements(Base.driver,HomePage.class);
        h.increment();
        h.setToCart();
    }

    @When("^User proceed to the checkout page$")
    public void user_proceed_to_the_checkout_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User will verify selected \"([^\"]*)\" items are displayed in the checkout page$")
    public void user_will_verify_selected_items_are_displayed_in_the_checkout_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    // .......


    @When("^User will add more than one item to the cart$")
    public void user_will_add_more_than_one_item_to_the_cart() throws Throwable {

        String [] itemsNeeded = {"Brocolli - 1 Kg", "Cucumber - 1 Kg", "Beans - 1 Kg"};

        Thread.sleep(2000);

        List<WebElement> products = h.getSelects();

        for (int i = 0; i < products.size() ; i++) {

            String name = products.get(i).getText();
            List itemNeededList = Arrays.asList(itemsNeeded);

            if(itemNeededList.contains(name)) {
                h
            }
        }

    }

    @Then("^User will verify selected items are displayed in the checkout page$")
    public void user_will_verify_selected_items_are_displayed_in_the_checkout_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
