package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyStepDefinitions {

    QualityDemyPage demyPage= new QualityDemyPage();
    @Given("Kullanici quality demy sayfasina gider")
    public void kullanici_quality_demy_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrl"));
        ReusableMethods.bekle(2);
        demyPage.acceptCookies.click();
    }
    @When("Email ve password bilgilerini girerek giris yapar")
    public void email_ve_password_bilgilerini_girerek_giris_yapar() {
        demyPage.loginLink.click();
        demyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        demyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        demyPage.loginButton.click();
    }
    @Then("Basarili bir sekilde giris yaptigini test eder")
    public void basarili_bir_sekilde_giris_yaptigini_test_eder() {
        Assert.assertTrue(demyPage.demyPicture.isDisplayed());
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


}
