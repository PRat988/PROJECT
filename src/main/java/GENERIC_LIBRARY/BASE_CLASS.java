package GENERIC_LIBRARY;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.ITestResult; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 

public class BASE_CLASS {
	
	public WebDriver driver;
    public PropertyFile pdata=new PropertyFile();	
    public WebDriverUtilities utilities=new WebDriverUtilities();
	@BeforeMethod
    public void openApp() throws IOException
    {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
    }
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name = res.getName();
		if(status==2)
		{
			PHOTO p= new PHOTO();
			p.getPhoto(driver, name);
		}
		driver.quit();
		}

}
