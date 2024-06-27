import Pages.FormFields;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestFormFields {

    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void formTest() throws InterruptedException {
        open("/");
        System.out.println(title());
        FormFields fillfields = page(FormFields.class);
        fillfields.ClickOnForm();
        fillfields.setUsername();
        fillfields.setCheckbox();
        fillfields.setRadio();
        fillfields.DropDown();
        fillfields.PrintWord();
        fillfields.EnterEmail();
        fillfields.EnterMessage();
        fillfields.ClickOnSubmit();
    }
}
