package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FormFields {
    private SelenideElement home = $("a[rel=\"home\"]");
    private final SelenideElement name = $("input[data-cy=\"name\"]");
    private final SelenideElement checkbox = $("label[for=\"drink2\"]");
    private final SelenideElement radio = $("label[for=\"color3\"]");
    private final SelenideElement dropdown = $("select[id=\"siblings\"]");
    private final SelenideElement print_word = $(By.xpath("//li[contains(text(),'Cheetah')]"));
    private final SelenideElement Email = $("input[id=\"email\"]");
    private final SelenideElement Message = $("textarea[id=\"message\"]");
    private final SelenideElement Submit = $("button[id=\"submit-btn\"]");
    private final SelenideElement form_button = $(By.xpath("//a[contains(text(),'Form Fields')]"));

    public void ClickOnForm() {
        $(form_button).click();
    }

    public void setUsername() {
        $(name).setValue("Kwame Mensah");
    }

    public void setCheckbox() {
        WebElement verify = $(checkbox);
        verify.click();
        verify.isSelected();
    }

    public void setRadio() {
        $(radio).click();
    }

    public void DropDown() {
        WebElement view = $(dropdown);
        ((SelenideElement) view).selectOption(3);
        System.out.println(view.getText());
    }

    public void PrintWord() {
        System.out.println($(print_word).getText());
    }

    public void EnterEmail() {
        $(Email).setValue("wonders@gmail.com");
    }

    public void EnterMessage() {
        $(Message).setValue("This is automation test practice");
    }

    public void ClickOnSubmit() throws InterruptedException {
        $(Submit).click();
        switchTo().alert().accept();
    }
}
