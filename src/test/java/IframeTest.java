import Pages.Iframe;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class IframeTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void test() throws InterruptedException {
        open("/");
        Configuration.timeout = 10000;
        Iframe frame = page(Iframe.class);
        frame.click_iframe_button();
        frame.select_iframe();
        frame.clickSubscribe();

    }

}
