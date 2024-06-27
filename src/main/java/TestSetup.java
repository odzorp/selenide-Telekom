import com.codeborne.selenide.Configuration;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestSetup {
    public static void loadProperties() {
        Properties properties = new Properties();
        try {
            FileInputStream input = new FileInputStream("src/test/resources/config.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set Selenide configuration using loaded properties
        Configuration.baseUrl = properties.getProperty("baseUrl", "https://practice-automation.com/");
        Configuration.browser = properties.getProperty("browser", "edge");
        Configuration.timeout = Long.parseLong(properties.getProperty("timeout", "5000"));
        Configuration.headless = Boolean.parseBoolean(properties.getProperty("headless", "false"));

    }
}
