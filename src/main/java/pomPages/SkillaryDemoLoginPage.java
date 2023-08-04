package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoLoginPage {
	
	//address of course element
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of drop down WebElement [select category]
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//address of selenium training webElement
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	//initialization
	public SkillaryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getcoursedd()
	{
		return coursedd;
	}
	
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}
	
	
	
}
