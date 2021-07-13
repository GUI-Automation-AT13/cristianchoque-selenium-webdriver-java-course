package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375, 812));

//        Search a element by linktext then click in the webelement
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        System.out.println(driver.getTitle());
//        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests tests = new BaseTests();
        tests.setUp();
    }

}
