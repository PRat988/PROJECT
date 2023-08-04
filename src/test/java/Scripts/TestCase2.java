package Scripts;

import java.io.IOException;
import pomPages.TestingPage;
import org.testng.annotations.Test;
import pomPages.SkillaryLoginPage;
import GENERIC_LIBRARY.BASE_CLASS;
import pomPages.SkillaryDemoLoginPage;
public class TestCase2 extends BASE_CLASS{
	
	@Test
	public void tc2() throws Throwable
	{
		SkillaryLoginPage s = new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillarydemoapplication();
		utilities.switchingtabs(driver);
		SkillaryDemoLoginPage sd = new SkillaryDemoLoginPage(driver);
		utilities.dropDown(sd.getcoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		Thread.sleep(3000);
		utilities.dragdrop(driver,tp.getSeleniumTraining(),tp.getCarttab());
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	

}
