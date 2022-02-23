package com.test.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingPractice {
	WebDriver driver;
	@Test(priority=1)
	public void NavigateUrl() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");

	}
	@Test(priority=2)
	public void Registration() throws Exception {

		driver.findElement(By.xpath("//a[@class=' login']")).click();
		Thread.sleep(3000);
		Select Mr = new Select(driver.findElement(By.name("customer[user_attributes][additional_detail][salutation]")));
		Mr.selectByVisibleText("Mrs");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_user_attributes_additional_detail_first_name")).sendKeys("AbidaKhan");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_user_attributes_additional_detail_last_name")).sendKeys("Adara");
		Thread.sleep(1000);
		driver.findElement(By.name("customer[user_attributes][email]")).sendKeys("santhiSa971@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("customer[user_attributes][password]")).sendKeys("Santhi$$971");
		driver.findElement(By.name("customer[user_attributes][password_confirmation]")).sendKeys("Santhi$$971");
		Select Nationality = new Select(driver.findElement(By.name("customer[user_attributes][additional_detail][nationality]")));
		Nationality.selectByVisibleText("AUSTRIA");
		Thread.sleep(1000);
		driver.findElement(By.name("commit")).click(); // Login to the Axicomwebsite
		driver.findElement(By.name("user_session[email]")).sendKeys("santhiSa971@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("user_session[password]")).sendKeys("Santhi$$971");
		Thread.sleep(1000);
		driver.findElement(By.id("user_session_submit")).click();

	}
	@Test(priority=3)
	public void WorkFlow() throws Exception {

		WebElement Tablet = driver.findElement(By.xpath("//a[@class='dropdown-toggle tablets']"));
		Actions act = new Actions(driver);
		act.moveToElement(Tablet).build().perform();
		Thread.sleep(1000);
		WebElement Samsung = driver.findElement(By.linkText("Samsung"));

		act.moveToElement(Samsung).build().perform();
		Samsung.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i <= 6; i++) {
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(3000);

		}
		for (int i = 0; i <= 8; i++) {
			js.executeScript("window.scrollBy(0,-250)");
		}
		Thread.sleep(2000);
		// for TOUCHMATE TABLET SAMSUNG GALAXY TAB S7 FE
		driver.findElement(By.xpath("//div[@id='facet-price_range']/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//img[@title='SAMSUNG GALAXY TAB S7 FE,  mystic silver, 64gb, 5g']")).click();
		Select Quality = new Select(driver.findElement(By.id("variant_quantity")));
		Quality.selectByVisibleText("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button add-to-cart']")).click();

		driver.findElement(By.linkText("Choose Add Ons")).click();
		driver.findElement(By.xpath("//input[@class='button add-bundles-to-cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='cart shopping-cart items-present']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='proceed-to-checkout-button']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')][2]")).click();





	}
}
