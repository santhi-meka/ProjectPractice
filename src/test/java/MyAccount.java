import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccount {
    WebDriver driver;
	@Test
  public void MyAcc() throws Exception {
	  
	 // WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
		
		
		driver.findElement(By.xpath("//div[@class='top-links']/a[6]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_session_email']")).sendKeys("santhiSa971@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user_session_password']")).sendKeys("Santhi$$971");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user_session_submit']")).click();

		 Actions act = new Actions(driver);
		   WebElement  MyAcc= driver.findElement(By.xpath("//div[@id='left-slot']/div/ul/li[2]"));
		   act.moveToElement(MyAcc).build().perform();
		     MyAcc.click();
		     
		     WebElement AddBook = driver.findElement(By.xpath("//div[@class='your-account-nav']/ul/li[4]"));
			   act.moveToElement(AddBook).build().perform();
			   AddBook.click();
			  // driver.findElement(By.xpath("//div[@class='your-account-nav']/ul/li[4]")).click();
			   
			   driver.findElement(By.xpath("//div[@class='top-links']/a[2]")).click();
			   
			   
  }
}
