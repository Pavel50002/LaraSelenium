package company;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class UntitledTestCase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
     //   System.setProperty("webdriver.gecko.driver", "C:\\Driversforjava\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    Random random1 = new Random();
    int random = random1.nextInt(10000);


    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пользователи'])[1]/following::span[1]")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Pavel55555" + random);
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("Pavel55555" + random + "@ya.ru");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль'])[2]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль'])[2]/following::input[1]")).sendKeys("123");
        driver.findElement(By.name("act_register_now")).click();
        driver.findElement(By.linkText("Добавить пользователя")).click();
        driver.findElement(By.name("noibiz_name")).click();
        driver.findElement(By.name("noibiz_name")).clear();
        driver.findElement(By.name("noibiz_name")).sendKeys("Pavel50002" + random);
        driver.findElement(By.name("noibiz_email")).clear();
        driver.findElement(By.name("noibiz_email")).sendKeys("Pavel50002" + random + "@ya.ru");
        driver.findElement(By.name("noibiz_email")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("noibiz_password")).clear();
        driver.findElement(By.name("noibiz_password")).sendKeys("123");
        driver.findElement(By.name("act_create")).click();
        driver.findElement(By.linkText("pavel55555" + random)).click();
        driver.findElement(By.linkText("Выход")).click();
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
    String GetSearchMagic = "http://users.bugred.ru/tasks/rest/magicsearch";




}