import Pages.WindowsOperation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.TestSetup;

import static com.codeborne.selenide.Selenide.*;

public class WindowsOperationTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void test() throws InterruptedException {
        open("/");
        System.out.println(title());
        WindowsOperation operation = page(WindowsOperation.class);
        operation.Click_Window_Button();
        operation.NewTab();
        operation.ReplaceWindow();
        operation.NewWindow();
    }
}
