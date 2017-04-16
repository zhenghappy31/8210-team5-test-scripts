package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateSchool {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://msdmsag5.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateSchool() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("1@1.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("111111");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Administration")).click();
    driver.findElement(By.linkText("Schools")).click();
    driver.findElement(By.linkText("Add New School")).click();
    driver.findElement(By.id("s_name")).clear();
    driver.findElement(By.id("s_name")).sendKeys("No.1");
    driver.findElement(By.id("s_number")).clear();
    driver.findElement(By.id("s_number")).sendKeys("1");
    driver.findElement(By.id("s_street")).clear();
    driver.findElement(By.id("s_street")).sendKeys("1 st");
    driver.findElement(By.id("s_city")).clear();
    driver.findElement(By.id("s_city")).sendKeys("1");
    driver.findElement(By.id("s_state")).clear();
    driver.findElement(By.id("s_state")).sendKeys("1");
    driver.findElement(By.id("s_zip")).clear();
    driver.findElement(By.id("s_zip")).sendKeys("11111");
    driver.findElement(By.id("s_contact")).clear();
    driver.findElement(By.id("s_contact")).sendKeys("No.1");
    driver.findElement(By.id("s_email")).clear();
    driver.findElement(By.id("s_email")).sendKeys("1@11.com");
    driver.findElement(By.id("s_phone")).clear();
    driver.findElement(By.id("s_phone")).sendKeys("1111111111");
    driver.findElement(By.xpath("//input[@value='Save']")).click();
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
}
