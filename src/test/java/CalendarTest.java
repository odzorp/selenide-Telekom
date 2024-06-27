import Pages.Calendar;
import Pages.PopUp;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CalendarTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void test() {
        open("/");
        System.out.println(title());
        Calendar day = page(Calendar.class);
        day.selectCalendar();
        day.ClickOnCalendar();
        day.selectDate();
        day.clickSubmit();
        day.VerifyMessageDisplayed();
    }

}
