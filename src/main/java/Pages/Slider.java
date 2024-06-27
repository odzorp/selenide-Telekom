package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
public class Slider extends Iframe{
    private SelenideElement slider = $(By.cssSelector("input[id=\"slideMe\"]"));
    private SelenideElement value = $(By.xpath("//span[@id='value']"));
    private SelenideElement slide = $("a[href=\"https://practice-automation.com/slider/\"]");

    public void click_slide_button(){
        $(slide).click();
    }

    public void SlideMe() {
        int sliderWidth = slider.getSize().width;
        Random random = new Random();
        int randomPosition = random.nextInt(101);
        int offset = (int) ((randomPosition / 100.0) * sliderWidth);

        // Perform the drag-and-drop action
        actions().clickAndHold(slider)
                .moveByOffset(offset - (sliderWidth / 2), 0)
                .release()
                .perform();
    }

    public void CurrentValue(){
        String point = value.shouldBe(Condition.visible).getText();
        System.out.println(point);
    }
}
