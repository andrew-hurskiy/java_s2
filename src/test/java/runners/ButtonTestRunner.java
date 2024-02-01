package runners;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {
                "src/test/cucumber/",
        },
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"steps", "hooks"})

public class ButtonTestRunner {
    @BeforeClass
    public static void before() {
        Configuration.remote = "http://test05.taf.nl:4444/";
        Configuration.browserSize = "1600x1024";
    }

}
