import Pages.FileDownload;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FileDownloadTest {
    @BeforeTest
    public void VisitPage() {
        TestSetup.loadProperties();
    }

    @Test
    public void test() {
        open("/");
        FileDownload download = page(FileDownload.class);
        download.click_download_button();
        download.DownLoadpdf();
        //download.DownLoaddocx();
    }

}
