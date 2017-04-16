package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateField {
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
  public void testCreateField() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("1@1.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("111111");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Administration")).click();
    driver.findElement(By.linkText("Fields")).click();
    driver.findElement(By.linkText("Enter New Field Details")).click();
    driver.findElement(By.id("f_number")).clear();
    driver.findElement(By.id("f_number")).sendKeys("5");
    driver.findElement(By.id("f_name")).clear();
    driver.findElement(By.id("f_name")).sendKeys("Field 5");
    driver.findElement(By.id("f_street")).clear();
    driver.findElement(By.id("f_street")).sendKeys("5th st");
    driver.findElement(By.id("f_city")).clear();
    driver.findElement(By.id("f_city")).sendKeys("5th city");
    driver.findElement(By.id("f_state")).clear();
    driver.findElement(By.id("f_state")).sendKeys("5th");
    driver.findElement(By.id("f_zip")).clear();
    driver.findElement(By.id("f_zip")).sendKeys("55555");
    driver.findElement(By.id("f_oworg")).clear();
    driver.findElement(By.id("f_oworg")).sendKeys("5th");
    driver.findElement(By.id("f_conname")).clear();
    driver.findElement(By.id("f_conname")).sendKeys("5th");
    driver.findElement(By.id("f_conemail")).clear();
    driver.findElement(By.id("f_conemail")).sendKeys("5@55.com");
    driver.findElement(By.id("f_conphone")).clear();
    driver.findElement(By.id("f_conphone")).sendKeys("5555555555");
    driver.findElement(By.id("f_notes")).clear();
    driver.findElement(By.id("f_notes")).sendKeys("The 5th field");
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
