package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "pretty",//renkli yazdirmak icin //bircok raporlama cesidi var arastir
                "html:target/cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/resources/features", //xml rapor
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hook"},
        tags="@Practice",
        dryRun = false

)

public class Runner {

}