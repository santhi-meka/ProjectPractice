import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactWithUs {
	WebDriver driver;
	@Test
	public void Contact() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
		driver.manage().window().maximize();

		// Support for the product..

		driver.findElement(By.xpath("//div[@id='ft-wrap']/div[4]/div/div/div/div[1]/ul/li[1]")).click();

		// Contact with Face Book..
		//driver.findElement(By.xpath("//div[@id='ft-wrap']/div[4]/div/div/div/div[4]/ul/li/a/em")).click();




	}
}
