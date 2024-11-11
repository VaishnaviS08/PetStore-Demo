import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static ChromeOptions options;      //Declaring Variables
    public static WebDriver driver;         //Declaring Variables

    @BeforeTest
    public static void Setup() {

        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.get("https://petstore.octoperf.com/");
        System.out.println("Page Title: " + driver.getTitle());


    }

    @Test
    void teststeps() {

        driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();


    }
}