package Product;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.WebDriver_Utility;
import OrganizationPom.CreateProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductTest extends BaseClass {

	@Test(retryAnalyzer =Generic_utility.RetryImplementation.class)
	public void createProductTest()  throws Throwable {
HomePage home=new HomePage(driver);
home.productLink();
CreateProductPage productpage=new CreateProductPage(driver);
//click on +sign
productpage.clickonPlusSign();

//Assert.assertEquals(false, true);
int ranNum = jlib.getRandomNum();
//fetching data from excel sheet
String productData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;
productpage.productName(productData);
productpage.saveButton(driver);

Thread.sleep(3000);
//log out
home.logout(driver);

	}

}
