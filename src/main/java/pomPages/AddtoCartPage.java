package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement add;
	
	public WebElement getAdd() {
		return add;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btn;
	
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbtn() {
		btn.click();
	}
}

