package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class PopUp extends FormFields {
    private final SelenideElement popup1 = $(By.id("alert"));
    private final SelenideElement popup2 = $(By.id("prompt"));
    private final SelenideElement popup3 = $(By.id("confirm"));
    private final SelenideElement popMessage = $(By.xpath("//p[@id='confirmResult']"));
    private final SelenideElement popup_button = $(By.xpath("//a[contains(text(),'Popups')]"));

    public void Click_button() {
        $(popup_button).click();
    }

    public void AlertPopUp() {
        $(popup1).click();
        String alertText = switchTo().alert().getText();
        switchTo().alert().accept();
        ;
        if (!"Hi there, pal!".equals(alertText)) {
            throw new AssertionError("Unexpected alert text: " + alertText);
        }
    }

    public void PromptPopUp(String alert_message) {
        $(popup2).click();
        switchTo().alert().sendKeys(alert_message);
        switchTo().alert().accept();
    }

    public void ConfirmPopUp() {
        $(popup3).click();
        switchTo().alert().accept();
    }

}
