import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp(){
		
		driver = new ChromeDriver();
		
	 
		
	}
	@Test
	public void doLogin(){
		
		driver.get("https://gmail.com");

		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("spulisheri@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asdfgh");
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
		
	}
}
