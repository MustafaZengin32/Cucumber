package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        Thread.sleep(3000);
    }
    @When("kullanici iphone aratir")
    public void kullanici_iphone_aratir() {

        amazonPage.searchbox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("kullanici sonuclarin iphone icerdigini test eder")
    public void kullanici_sonuclarin_iphone_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.result.isDisplayed());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @When("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchbox.sendKeys("Selenium"+ Keys.ENTER);
    }

    @Then("kullanici sonuclarin Selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());
    }

    @When("kullanici Java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.searchbox.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("kullanici sonuclarin Java icerdigini test eder")
    public void kullaniciSonuclarinJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());
    }

    @When("kullanici {string} aratir")
    public void kullaniciAratir(String arananNesne) {
        amazonPage.searchbox.sendKeys(arananNesne+Keys.ENTER);
    }

    @Then("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String Nesne) {
        Assert.assertTrue(amazonPage.result.getText().contains(Nesne));

    }
}
