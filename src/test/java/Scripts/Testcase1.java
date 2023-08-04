package Scripts;

import org.testng.annotations.Test;

import GENERIC_LIBRARY.BASE_CLASS;
import GENERIC_LIBRARY.WebDriverUtilities;
import pomPages.SkillaryLoginPage;
import pomPages.SkillaryDemoLoginPage;
import pomPages.AddToCartPage;
public class Testcase1 extends BASE_CLASS {
	
	@Test
	public void tc1()
	{
		//WebDriverUtilities util=new WebDriverUtilities();
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillarydemoapplication();
		utilities.switchingtabs(driver);
		SkillaryDemoLoginPage sd=new SkillaryDemoLoginPage(driver);
		utilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddToCartPage d=new AddToCartPage(driver);
		utilities.doubleclick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilities.alertPopup(driver);
		
		
		
		
	}

}
