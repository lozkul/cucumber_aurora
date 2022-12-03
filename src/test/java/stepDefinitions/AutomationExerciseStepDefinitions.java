package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("Kullanici Signup butonuna tiklar")
    public void kullanici_signup_butonuna_tiklar() {
        automationExercisePage.signUpLink.click();
    }
    @Then("Kullanici mail kutusuna {string} girer")
    public void kullanici_mail_kutusuna_girer(String istenenMail) {
        automationExercisePage.emailBox.sendKeys(ConfigReader.getProperty(istenenMail));
    }
    @Then("Kullanici password kutusuna {string} girer")
    public void kullanici_password_kutusuna_girer(String istenenPassword) {
        automationExercisePage.passwordBox.sendKeys(ConfigReader.getProperty(istenenPassword));
    }
    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        automationExercisePage.loginButonu.click();
    }
    @Then("Kullanici Automation sayfasina girdigini test eder")
    public void kullanici_automation_sayfasina_girdigini_test_eder() {
        Assert.assertTrue(automationExercisePage.logoutButonu.isDisplayed());
    }

}
