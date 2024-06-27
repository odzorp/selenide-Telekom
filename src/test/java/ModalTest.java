import Pages.Modal;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ModalTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void test() throws InterruptedException {
        open("/");
        System.out.println(title());
        Modal modal = page(Modal.class);
        modal.modal_button();
        modal.SimpleModal();
        modal.CardText();
        modal.FormModal();
        modal.EnterYourName("John Wick");
        modal.EnterYourEmail("wick@google.com");
        modal.EnterYourMessage("This is my first test");
        modal.ClickSubmit();
    }

}
