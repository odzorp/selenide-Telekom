import Pages.FileUpload;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FileUploadTest {

    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void test() {
        open("/");
        System.out.println(title());
        FileUpload upload = page(FileUpload.class);
        upload.Click_Upload_Button();
        upload.Browse();
        upload.ClickUpload();
        upload.AssertMessage();
    }

}
