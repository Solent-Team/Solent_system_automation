package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomateTestCase {
    WebDriver driver;

    @BeforeMethod
    public void startChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }

    @Test
    public void LoginPageTest() {
        driver.get("http://127.0.0.1:3000/");
        driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/a[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/label[1]/input")).sendKeys("admin@mail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/label[2]/input")).sendKeys("admin@mail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/button")).click();
    }

    @Test
    public void contactUsPageTest() {
        driver.get("http://127.0.0.1:3000/Contact");
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/h1")).getText(), "Contact Us"
        );
    }

    @Test
    public void HowtopurchasePageTest() {
        driver.get("http://127.0.0.1:3000/Howtopurchase");
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/h2")).getText(), "Step 1: Select a Package"
        );
    }

    @Test
    public void PrivacypolicyPageTest() {
        driver.get("http://127.0.0.1:3000/Privacypolicy");
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/h3")).getText(), "Our Company Privacy Policy"
        );
    }

    @Test
    public void RefundpolicyPageTest() {
        driver.get("http://127.0.0.1:3000/Refundpolicy");
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/h3")).getText(), "Our Company Refund Policy"
        );
    }

}
