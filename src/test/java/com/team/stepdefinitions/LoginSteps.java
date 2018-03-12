package com.team.stepdefinitions;

import com.team.core.Elements;
import com.team.framework.DriverConfig;
import com.team.framework.Utils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import static com.team.framework.DriverConfig.driver;
import static com.team.framework.DriverConfig.getDriver;


public class LoginSteps{

    @Given("^I navigated to home$")
    public void i_navigated_to_home() throws Throwable {
        getDriver("browser");
        driver.get(System.getenv("website"));
        driver.manage().window().maximize();
       System.out.println("Navigated to Home page");
       Elements.findElement("login_page.user_name");
    }
    @When("^I enter login id$")
    public void i_enter_login_id() throws Throwable {
        throw new PendingException();

    }

}
