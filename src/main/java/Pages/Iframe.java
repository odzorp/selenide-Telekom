package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Iframe extends FileDownload {
    private final SelenideElement iframe_button = $(By.xpath("//a[contains(text(),'Iframes')]"));
    private final SelenideElement Frame = $(By.cssSelector("iframe[id=\"frame2\"]"));
    private final SelenideElement modal_alert = $(By.xpath("/html/body/div[4]/div[2]/div[3]/button[2]"));
    private final SelenideElement subscribe = $(By.xpath("//span[text()='Subscribe']"));
    private final SelenideElement newsLetter = $(By.xpath("//a[@class='AnchorLink NavBar__List--link']"));
//a[@class='AnchorLink NavBar__List--link']

    public void click_iframe_button() {

        $(iframe_button).click();
    }

    public void select_iframe() {
        switchTo().frame(Frame);
        System.out.println(title());
    }

    /*public void clickModal() {
        $(modal_alert).shouldBe(visible, Duration.ofSeconds(15)).click();
        $("button[aria-label=\"Menu\"]").shouldBe(visible, Duration.ofSeconds(10)).click();
    }*/

    public void clickSubscribe() {
        $(subscribe).click();
    }
}
