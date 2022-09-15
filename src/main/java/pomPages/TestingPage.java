package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	@FindBy(id="mycart")
	private WebElement carttab;
	
	public WebElement getCarttab() {
		return carttab;
	}
	
	@FindBy(xpath="//div[@class='icons']")
	private WebElement facebook;
	
	public WebElement getFacebook() {
		return facebook;
	}

	public TestingPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void facebookicon() {
		facebook.click();
	}
	

}
