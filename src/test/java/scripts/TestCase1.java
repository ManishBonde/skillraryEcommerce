package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {

	@Test
	public void tc1() throws InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApplication();

		utilities.switchTabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();

		AddtoCartPage ad = new AddtoCartPage(driver);
		utilities.doubleClick(driver, ad.getAdd());
		Thread.sleep(5000);
		ad.addtocartbtn();
		// utilities.alertPopupOk(driver);
	}

}
