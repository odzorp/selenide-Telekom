package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FileDownload extends FileUpload {
    private final SelenideElement download1 = $(By.xpath("//a[contains(@class,'wpdm-download-link download-on-click btn btn-primary')]"));
    private final SelenideElement download2 = $(By.xpath("//a[@class='wpdm-download-link wpdm-download-locked btn btn-primary ']"));
    private final SelenideElement keys = $(By.id("password_6653e6a71a66d_921"));
    private final SelenideElement button = $(By.cssSelector("input[id=\'wpdm_submit_6653e4fa67efc_921\']"));
    private final SelenideElement Iframeview = $(By.cssSelector("iframe[id=\"wpdm-lock-frame\"]"));
    private final SelenideElement Password = $(By.xpath("//input[@id='password_6656080f228d8_921']"));
    private final SelenideElement download_button = $(By.xpath("//a[contains(text(),'File Download')]"));


    public void click_download_button() {
        $(download_button).click();
    }

    public void DownLoadpdf() {
        $(download1).click();
    }

    public void DownLoaddocx() {
        $(download2).click();

    }

    public void verifyfromalert() {
    }
}
