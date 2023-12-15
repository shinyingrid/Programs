package OrganizationPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {

	//initalization
	public ValidationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='dtlview_Organization Name']")
	private WebElement orgValidate;
	
	@FindBy(xpath="//span[@id='dtlview_Campaign Name']")
	private WebElement campValidate;
	
	//getter method
	public WebElement getOrgValidate() {
		return orgValidate;
	}
	
	//Business Logics
	public String validateOrgname()
	{
		return orgValidate.getText();
	}
public String validateCamp()
{
	return campValidate.getText();
	
}
	



	
}
