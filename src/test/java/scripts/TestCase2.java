package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.switchTabs(driver);
		utilities.dropDown(sd.getCoursedd(),pdata.getPropertyfiledata("coursedd"));
		
		TestingPage tp = new TestingPage(driver);
		utilities.dragandDrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
		Point loc = tp.getFacebook().getLocation();
		int x= loc.getX();
		int y=loc.getY();
		utilities.srollBy(driver, x, y);
		tp.facebookicon();
	}
}
