package practiceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {

	WebDriver driver ;
	@Test
	public void login() {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\practiceTest\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}
	
	
	

}
