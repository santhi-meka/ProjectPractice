import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxiomTelecomExcel {
     WebDriver driver;
	@Test
  public void AT() throws IOException, Exception {
		WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	  driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
	  
	  String xlfile = "E:\\ExcelFiles\\AxiomTelecom.xlsx";
	  FileInputStream f1 = new FileInputStream(xlfile);
	 XSSFWorkbook book = new XSSFWorkbook(f1);
	  XSSFSheet sheet = book.getSheet("Login");
	  int rowCount = sheet.getLastRowNum();
	  for(int r=1;r<=rowCount;r++)
	  {
		  XSSFRow row = sheet.getRow(r);
		  String mailid = row.getCell(0).getStringCellValue();
		  String pwd = row.getCell(1).getStringCellValue();
		  driver.findElement(By.xpath("//input[@id='user_session_email']")).sendKeys(mailid);
		  driver.findElement(By.xpath("//input[@id='user_session_password']")).sendKeys(pwd);
		  driver.findElement(By.xpath("//input[@id='user_session_submit']")).click();
		  Thread.sleep(2000);
		  //String CurrUrl = driver.getCurrentUrl();
		  
		  
	  }
	  
  }
}
