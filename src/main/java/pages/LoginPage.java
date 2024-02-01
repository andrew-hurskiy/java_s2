package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage {

    public LoginPage open() {

        Selenide.open("https://demo.applitools.com/");
        return this;
    }

    public void enterFirstName(){
        $("input#username").setValue("Richard tomson");
    }

      public void enterLastName(){
        $("input#password").setValue("whatever");
    }

    public void signIn(){
        $("div.buttons-w").click();
    }


}
