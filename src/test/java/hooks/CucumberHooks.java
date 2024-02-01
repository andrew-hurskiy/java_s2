package hooks;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import com.google.common.io.Files;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CucumberHooks {

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String sessionId = getSessionId();
        }

    }

    public static String getSessionId() {
        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
    }


}
