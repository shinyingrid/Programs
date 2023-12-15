package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("singleframe");//switching based on id
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		//its working
		driver.switchTo().defaultContent();//if u want to perform any other actions on the page again u need to switch back to main frame
		driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
//		driver.quit();
		
		
	}

}
