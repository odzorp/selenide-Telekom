package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Table extends Modal {
    private final SelenideElement Oranges = $(By.xpath("//td[contains(text(),'$3.99')]"));
    private final SelenideElement Marbles = $(By.xpath(("//td[contains(text(),'$1.25')]")));
    private final SelenideElement Option = $(By.cssSelector("select[name=\"tablepress-1_length\"]"));
    private final SelenideElement searchBox = $(By.cssSelector("div[id=\"tablepress-1_filter\"] input[type=\"search\"]"));
    private final SelenideElement tableRecord = $(By.cssSelector("table[id=\"tablepress-1\"] tr[class=\"row-11 even\"]"));
    private final SelenideElement table_Button = $(By.xpath("//a[contains(text(),'Tables')]"));


    public void Click_Table_Button() {
        $(table_Button).click();
    }

    public void simpleTable1() throws InterruptedException {
        WebElement oranges = $(Oranges);
        String Item = oranges.getText();
        System.out.println(Item);
        $(Oranges).shouldHave(text("$3.99"));

        WebElement marbles = $(Marbles);
        String item = marbles.getText();
        System.out.println(item);
        $(marbles).shouldHave(text("$1.25"));
    }

    public void sortableTable() {
        WebElement mySelectElement = $(Option);
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByValue("100");
    }

    public void Search() {
        $(searchBox).setValue("Mex");
    }

    public void VerifyRecord() {
        WebElement record = $(tableRecord);
        String RecordRole = record.getText();
        System.out.println(RecordRole);
        $(tableRecord).shouldHave(text("10 Mexico 128.5"));
    }
}
