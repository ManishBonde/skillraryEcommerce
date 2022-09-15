package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishListPage;

public class TestCase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchTextBox(pdata.getPropertyfiledata("coursedata"));
		s.gobutton();
		
		CoreJavaPage c = new CoreJavaPage(driver);
		c.seleniumtraining();
	
		WishListPage w = new WishListPage(driver);
		w.cookiespopup();
		utilities.switchToFrame(driver);
		Thread.sleep(5000);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		utilities.switchBackFrame(driver);
		w.addtowishlistbtn();
	}

}
