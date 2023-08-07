package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class DriverManager {
    public static WebDriver driver = null;
    @BeforeTest
    public void setUpChrome() throws Exception {
        //WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\atbap\\IdeaProjects\\hierarchy\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    public void navigate(String address){
        driver.get(address);
    }

    @Test
    public void headerMenuTest() {
        try {
            setUpChrome();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        navigate("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement menuOption = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]"));
        String value = menuOption.getText();
        assertEquals("Clinic",value);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        System.out.println("The driver has been closed.");
    }
}
