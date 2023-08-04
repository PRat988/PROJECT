package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage {
	//declaration
	@FindBy(xpath="//a[text()='//a[text()=' Core Java for Selenium']']")
	private WebElement selenium;
	
	//initialization
	public CoreJavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void seleniumtraining()
	{
		selenium.click();
	}
	

}
