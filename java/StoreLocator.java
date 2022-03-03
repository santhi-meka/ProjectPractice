import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreLocator {
	WebDriver driver;
	@Test
	public void SLocator() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
		driver.findElement(By.xpath("//div[@class='top-links']/a[4]")).click();
		Thread.sleep(2000);
		//By using Drop down menu.....

		Select country = new Select(driver.findElement(By.xpath("//div[@id='form-input']/select[1]")));
		country.selectByVisibleText("UAE");
		

		Select city = new Select(driver.findElement(By.xpath("//div[@id='form-input']/select[2]")));  
		city.selectByVisibleText("ABU DHABI");
		

		Select type = new Select(driver.findElement(By.xpath("//div[@id='form-input']/select[3]")));  
		type.selectByVisibleText("SERVICE CENTER");
		   Thread.sleep(2000);

		   //By using Actions.........
		   
		   Actions act = new Actions(driver);
		   WebElement Go = driver.findElement(By.xpath("//button[@id='submit']"));
		   act.moveToElement(Go).build().perform();
		   Go.click();   
		   
		   
		   Actions act1 = new Actions(driver);
		   WebElement map = driver.findElement(By.xpath("//div[@class='gm-style-mtc'][1]"));
		   act1.moveToElement(map).build().perform();
		
		   


	}
}
