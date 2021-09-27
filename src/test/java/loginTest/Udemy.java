package loginTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Udemy {
	WebDriver driver;
	  @Test
	  public void login() {
		  driver.get("https://www.udemy.com/");
		  driver.findElement(By.linkText("Log in")).click();
		//  driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		//  driver.findElement(By.name("password")).sendKeys("1234456");
		//  driver.findElement(By.name("submit")).click();
		Assert.assertEquals(driver.getTitle(),"Attention Required! | Cloudflare");		  
		// Assert.assertTrue(driver.getTitle().contains(""));
		  
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  
		  
	  }

	  @AfterTest
	  public void afterTest()throws Exception {
		  Thread.sleep(2000);
		  driver.quit();
	  }

	}