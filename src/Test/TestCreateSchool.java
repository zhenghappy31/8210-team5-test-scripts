package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCreateSchool {
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
	    driver.findElement(By.linkText("Fields")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Enter New Field Details")).click();
	    Thread.sleep(5000);
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
	    Thread.sleep(5000);
		
		System.out.println("Application title is ============= " + driver.getTitle());
		
		driver.quit();
		
	}
	

}
