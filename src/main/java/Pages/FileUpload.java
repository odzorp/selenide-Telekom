package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class FileUpload extends WindowsOperation {
    private final SelenideElement file = $(By.cssSelector("input[id=\"file-upload\"]"));
    private final SelenideElement upload = $(By.cssSelector("input[id=\"upload-btn\"]"));
    private final SelenideElement Message = $(By.xpath("//div[@class='wpcf7-response-output']"));
    private final SelenideElement fileupload = $(By.xpath("//a[contains(text(),'File Upload')]"));
    private String link = "C:\\Users\\AlbertHughes\\Downloads\\Filecr.txt";

    public void Click_Upload_Button() {
        $(fileupload).click();
    }

    public void Browse() {

        $(file).uploadFile(new File(link));
    }

    public void ClickUpload() {
        $(upload).click();
    }

    public void AssertMessage() {
        String output = $(Message).getText();
        Message.shouldHave(exactText("Thank you for your message. It has been sent."));
    }
}
