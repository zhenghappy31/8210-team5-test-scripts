package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCreateField {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Assignment4\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://msdmsag5.herokuapp.com");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("1@1.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("111111");
	    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Administration")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Schools")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Add New School")).click();
	    Thread.sleep(5000);
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
	    Thread.sleep(5000);
	    
		System.out.println("Application title is ============= " + driver.getTitle());
		
		driver.quit();
		
	}
	

}
