package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public SkillaryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void skillarydemoapplication()
	{
		skillarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	public void gobutton()
	{
		searchbtn.click();
	}
	

}
