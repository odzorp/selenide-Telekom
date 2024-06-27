import Pages.FormFields;
import Pages.PopUp;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class PopUpTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void PopTest() throws InterruptedException {
        open("/");
        System.out.println(title());
        PopUp Pops = page(PopUp.class);
        Pops.Click_button();
        Pops.AlertPopUp();
        Pops.PromptPopUp("alert_message");
        Pops.ConfirmPopUp();
    }

}
