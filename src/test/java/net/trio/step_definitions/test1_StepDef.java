package net.trio.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.trio.pages.googleCom;
import net.trio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_StepDef {

    googleCom googleElements = new googleCom();

    @Given("user go to google.com")
    public void user_go_to_google_com() {


        Driver.getDriver().get("https:/www.google.com"); // driver1



    }

    @When("user search Cucumber")
    public void user_search_cucumber() {

        Driver.getDriver().get("https:/www.google.com");

        googleElements.searchInput.sendKeys("cucumber");
        googleElements.searchBtn.click();

    }

    @Then("user verify the title as")
    public void user_verify_the_title_as() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle  = "cucumber - Google Search";

        Assert.assertEquals(expectedTitle,actualTitle);



    }

}
