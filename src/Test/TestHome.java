package Test;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Assignment4\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://msdmsag5.herokuapp.com");
	    driver.findElement(By.linkText("Visit ongoing matches")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Home (current)")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Tournament List")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Home (current)")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("About MSA")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Home (current)")).click();
	    Thread.sleep(5000);
		
		System.out.println("Application title is ============= " + driver.getTitle());
		
		driver.quit();
		
	}
	

}
