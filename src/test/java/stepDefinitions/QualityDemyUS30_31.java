package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualityDemyUS30_31 {

    QualityDemyPage demyPage= new QualityDemyPage();

    @Given("Launch browser and Go to url")
    public void launch_browser_and_go_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrl"));
        demyPage.acceptCookies.click();
    }
    @Then("Click on Login button")
    public void click_on_button() {
        demyPage.loginLink.click();
    }
    @Then("Enter correct instructor email address and password")
    public void enter_correct_instructor_email_address_and_password() {
        demyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmailInsBora"));
        demyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPasswordInsBora"));
        demyPage.loginButton.click();
    }
    @Then("Click on the Instructor button")
    public void click_on_the_instructor_button() {
        demyPage.instructor.click();
    }
    @Then("Click on Course Manager from the menu under Navigation")
    public void click_on_course_manager_from_the_menu_under_navigation() {
        demyPage.courseManagerButton.click();
    }
    @Then("Click on Add New Course in the upper right corner of the page")
    public void click_on_add_new_course_in_the_upper_right_corner_of_the_page() {
        demyPage.add_newcourse.click();
    }
    @Then("Click Requirements from the row under the Course Add Form")
    public void click_requirements_from_the_row_under_the_course_add_form() {
        demyPage.requirementsButton.click();
    }
    @Then("Add a box by pressing the green + button.")
    public void add_a_box_by_pressing_the_green_button() {
        demyPage.requirementsGreenPlusButton.click();
        Assert.assertTrue(demyPage.requirementsButton.isDisplayed());
    }
    @Then("Log out by closing the page")
    public void log_out_by_closing_the_page() {
        Driver.closeDriver();
    }

    @Then("Click Outcomes from the row under the Course Add Form")
    public void click_outcomes_from_the_row_under_the_course_add_form() {
        demyPage.outComesButton.click();
    }
    @Then("Add a box outcomes by pressing the green + button.")
    public void add_a_box_outcomes_by_pressing_the_green_button() {
        demyPage.outComesGreenPlusButton.click();
        Assert.assertTrue(demyPage.outComesRedMinusButton.isDisplayed());
    }

}
