package Examples;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_utility.Excel_utility;


public class Dataprovider {

	@Test(dataProvider="getdata")
	public void m1(String orgName,String phoneNum,String emailId) throws Throwable
	{
	//WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	Random ran = new Random();
	int rannum = ran.nextInt(1000);
	
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys(orgName+rannum);
	driver.findElement(By.name("phone")).sendKeys(phoneNum);
	driver.findElement(By.id("email1")).sendKeys(emailId);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	Thread.sleep(1000);
	driver.quit();
	}
@DataProvider
public Object[][] getdata() throws Throwable
{
	Excel_utility elib=new Excel_utility();
	Object[][] Obj = elib.readMultipleData("Sheet1");
	return Obj;
}
}
