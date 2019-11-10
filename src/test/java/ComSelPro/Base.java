//when you change something in properties you don't need to recompile your java project
//It is used to store information which is to be changed frequently.
//key=value
// You can get easily values from properties file
//it sound like changing a part of engine while the engine is running
package ComSelPro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/hakkiyaz/IdeaProjects/MyFinalProject/src/test/java/ComSelPro/global.properties");
        prop.load(fis);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

}
