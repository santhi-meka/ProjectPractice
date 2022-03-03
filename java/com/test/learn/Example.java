package com.test.learn;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Example {
    WebDriver driver;
  @Test
  public void HaiTest() throws Exception {
	  WebElement Tablet = driver.findElement(By.xpath("//a[@class='dropdown-toggle tablets']"));
		Actions act = new Actions(driver);
		act.moveToElement(Tablet).build().perform();
		Thread.sleep(1000);
		WebElement Samsung = driver.findElement(By.linkText("Samsung"));

		act.moveToElement(Samsung).build().perform();
		Samsung.click();
		Thread.sleep(1000);

		
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

  @AfterMethod()
  public void afterMethod() {
	 
	  }

  @BeforeClass
  public void beforeClass() throws Exception {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i <= 8; i++) {
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(3000);

		}
		for (int i = 0; i <= 8; i++) {
			js.executeScript("window.scrollBy(0,-300)");
		}
		
		

		WebElement Tablet = driver.findElement(By.xpath("//a[@class='dropdown-toggle tablets']"));
		Actions act = new Actions(driver);
		act.moveToElement(Tablet).build().perform();
		Thread.sleep(1000);
		
		
		WebElement Samsung = driver.findElement(By.linkText("Samsung"));

		act.moveToElement(Samsung).build().perform();
		Samsung.click();
		Thread.sleep(1000);
	  }

  @AfterClass
  public void afterClass() {
	 // System.out.println("AC");
	  }

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
		
			  driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
	  
	  }

  @AfterTest
  public void afterTest() {
	 // System.out.println("AT");
	  }

}
