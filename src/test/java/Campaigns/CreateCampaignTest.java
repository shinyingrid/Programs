package Campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.WebDriver_Utility;
import OrganizationPom.CreateCampaginsPage;
import OrganizationPom.HomePage;

import OrganizationPom.LoginPage1;
import OrganizationPom.ValidationPage;


public class CreateCampaignTest extends BaseClass {
@Test(retryAnalyzer = Generic_utility.RetryImplementation.class)
	public void createCampaignTest() throws Throwable {
		WebDriver_Utility wlib=new WebDriver_Utility();


HomePage home=new HomePage(driver);
home.clickMoreLink();
home.clickCampLink();


CreateCampaginsPage camp=new CreateCampaginsPage(driver);
camp.clickOnImg();

//Assert.assertEquals(false, true);
Java_Utility jlib=new Java_Utility();
int ranNum = jlib.getRandomNum();
Excel_utility elib=new Excel_utility();
  String campData = elib.getExcelDataUsingDataFormatter("Campaigns", 2, 1)+ranNum;
  camp.campaignsName(campData);
//driver.findElement(By.name("campaignname")).sendKeys(campData);
  camp.saveCamp();
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
Thread.sleep(2000);

ValidationPage valid=new ValidationPage(driver);
String actData = valid.validateCamp();

Assert.assertEquals(actData, campData);
home.logout(driver);

	}

}
