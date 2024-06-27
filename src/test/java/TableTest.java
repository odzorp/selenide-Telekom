import Pages.Table;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class TableTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void TestItemPrices() throws InterruptedException {
        open("/");
        System.out.println(title());
        Table price = page(Table.class);
        price.Click_Table_Button();
        price.simpleTable1();
        price.sortableTable();
        price.Search();
        price.VerifyRecord();
    }

}
