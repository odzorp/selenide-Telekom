package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Set;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class WindowsOperation extends Table {
    private final SelenideElement newtab = $(By.xpath("//b[contains(text(),'New Tab')]"));
    private final SelenideElement replacewindow = $(By.cssSelector("button[onclick=\"newWindowSelf()\"]"));
    private final SelenideElement window = $(By.cssSelector("button[onclick=\"newWindow()\"]"));
    private final SelenideElement dialog = $(By.xpath("//div[@class='wp-block-media-text__content']"));
    private final SelenideElement logo = $(By.cssSelector("a[href=\"https://automatenow.io/\"]"));
    private final SelenideElement rest = $(By.cssSelector("img[alt=\"REST Assured tutorials\"]"));
    private final SelenideElement subscribe = $(By.cssSelector("input[type=\"email\"]"));
    private final SelenideElement clicksubscribe = $(By.xpath("//button[contains(text(),'Subscribe')]"));
    private final SelenideElement window_Button = $(By.xpath("//a[contains(text(),'Window Operations')]"));


    public void Click_Window_Button() {
        $(window_Button).click();
    }

    public void NewTab() throws InterruptedException {
        $(newtab).click();
        String originalWindowHandle = webdriver().driver().getWebDriver().getWindowHandle();
        switchToNewWindow(originalWindowHandle);
        $(logo).shouldBe(visible);
        System.out.println($(logo).getText());
        clearBrowserCookies();
        closeWindow();

    }

    public void ReplaceWindow() throws InterruptedException {
        open("https://practice-automation.com/window-operations/");
        $(replacewindow).click();
        String originalWindowHandle = webdriver().driver().getWebDriver().getWindowHandle();
        switchToNewWindow(originalWindowHandle);
        $(rest).shouldBe(visible).click();
        webdriver().shouldHave(urlContaining("https://automatenow.io/rest-assured-tutorials/"));
        $(subscribe).shouldBe(visible).setValue("www.corn22google.com");
        $(clicksubscribe).shouldBe(clickable).click();
        clearBrowserCookies();
        closeWindow();
    }

    public void NewWindow() throws InterruptedException {
        open("https://practice-automation.com/window-operations/");
        $(window).click();
        String originalWindowHandle = webdriver().driver().getWebDriver().getWindowHandle();
        switchToNewWindow(originalWindowHandle);
        clearBrowserCookies();
        closeWindow();

    }

    private void switchToNewWindow(String originalWindowHandle) throws InterruptedException {
        Set<String> allWindows = webdriver().driver().getWebDriver().getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(webdriver().driver().getWebDriver().getWindowHandle())) {
                switchTo().window(windowHandle);
                break;
            }
        }
    }

    private void switchBackToOriginalWindow(String originalWindowHandle) throws InterruptedException {
        closeWindow();
        switchTo().window(originalWindowHandle);
    }
}
