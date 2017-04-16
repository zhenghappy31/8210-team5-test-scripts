package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomeC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Assignment4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://msdmsag5.herokuapp.com");
	    
	    System.out.println("Application title is ============= " + driver.getTitle());
		
		driver.quit();

	}

}
