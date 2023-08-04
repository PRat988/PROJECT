package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	@FindBy(xpath="")
	private WebElement plybtn;
	
	@FindBy(xpath="")
	private WebElement pausebtn;
	
	@FindBy(xpath="")
	private WebElement addtoWishList;
	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void playbutton()
	{
		plybtn.click();
	}
	public void pausebutton()
	{
		pausebtn.click();
	}
	
	public void addToWishList()
	{
		addtoWishList.click();
	}

}
