import Pages.Slider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SliderTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
        open("/");
    }

    @Test
    public void test() {
        open("/");
        Slider slide = page(Slider.class);
        slide.click_slide_button();
        slide.SlideMe();
        slide.CurrentValue();
    }
}
