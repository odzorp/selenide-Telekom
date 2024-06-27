package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class Calendar extends PopUp {
    private final SelenideElement calendar = $(By.xpath("//input[@id=\"g1065-selectorenteradate\"]"));
    private final SelenideElement date = $(By.cssSelector("[data-date=\"21\"]"));
    private final SelenideElement send = $(By.cssSelector("div[class='entry-content'] button[type='submit']"));
    private final SelenideElement display = $(By.xpath("//div//h4[@id=\"contact-form-success-header\"]"));
    private final SelenideElement calendar_button = $(By.xpath("//a[contains(text(),'Calendars')]"));

    public void selectCalendar() {
        $(calendar_button).click();
    }

    public void ClickOnCalendar() {
        $(calendar).click();
    }

    public void selectDate() {
        $(date).click();
    }

    public void clickSubmit() {
        $(send).click();
    }

    public void VerifyMessageDisplayed() {
        WebElement message = $(display);
        String Message = message.getText();
        if (!"Your message has been sent".equals(Message)) {
            throw new AssertionError("Unexpected Success message: " + Message);
        }
    }
}
