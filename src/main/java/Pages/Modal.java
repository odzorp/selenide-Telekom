package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Modal extends Calendar{
    private final SelenideElement simple = $(By.id("simpleModal"));
    private final SelenideElement Form = $(By.xpath("//button[@id='formModal']"));
    private final SelenideElement simpleCard = $(By.cssSelector("div[id=\"popmake-1318\"] "));
    private final SelenideElement simpleText = $(By.cssSelector("div[id=\"popmake-1318\"] div[class=\"pum-content popmake-content\"]"));
    private final SelenideElement close = $(By.cssSelector("div[id=\"popmake-1318\"] button[class=\"pum-close popmake-close\"]"));
    private final SelenideElement CardBody = $(By.cssSelector("div[id=\"popmake-674\"]"));
    private final SelenideElement namefield = $(By.cssSelector("input[id=\"g1051-name\"]"));
    private final SelenideElement Email = $(By.cssSelector("input[id=\"g1051-email\"]"));
    private final SelenideElement textarea = $(By.cssSelector("textarea[id=\"contact-form-comment-g1051-message\"]"));
    private final SelenideElement sUbmit = $(By.cssSelector("p[class=\"contact-submit\"] button[type=\"submit\"]"));
    private final SelenideElement ModalButton = $(By.xpath("//a[contains(text(),'Modals')]"));

    public void modal_button() throws InterruptedException {
        $(ModalButton).click();
        Thread.sleep(5000);
    }
    public void SimpleModal(){
        $(simple).click();
        WebElement cardMessage = $(simpleCard);
        ((SelenideElement) cardMessage).shouldBe(visible);
    }
    public void CardText() throws InterruptedException {
        String expectedText = "Hi, I’m a simple modal.";
        simpleText.shouldBe(visible).shouldHave(text(expectedText));
        Thread.sleep(5000);
        close.click();

    }
    public void FormModal() throws InterruptedException {
        $(Form).click();
        $(CardBody).shouldBe(visible);

    }
    public void EnterYourName(String name) throws InterruptedException {
        $(namefield).sendKeys(name);
    }
    public void EnterYourEmail(String email) throws InterruptedException {
        $(Email).sendKeys(email);
    }
    public void EnterYourMessage(String message) throws InterruptedException {
        $(textarea).sendKeys((message));
    }
    public void ClickSubmit(){
        $(sUbmit).click();
    }

}
